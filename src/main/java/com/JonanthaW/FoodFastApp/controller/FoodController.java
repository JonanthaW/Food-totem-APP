package com.JonanthaW.FoodFastApp.controller;

import com.JonanthaW.FoodFastApp.entity.Food;
import com.JonanthaW.FoodFastApp.service.FoodService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/comida")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    private List<Food> getAllFood() {
        return foodService.getAllFood();
    }


    @GetMapping("/tipo/{categoriaId}")
    public ResponseEntity<?> getFoodByCategoriaId(@PathVariable Long categoriaId) {
        List<Food> foodOptional = foodService.findAllByCategoriaId(categoriaId);
        if (foodOptional != null) {
            return ResponseEntity.ok(foodOptional);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food category not found.");
        }
    }

    @PostMapping
    public Optional<Food> createFood(@RequestBody Food food) {
        return foodService.createFood(food);
    }

    @DeleteMapping("/delete/{comidaId}")
    public ResponseEntity<String> deleteByComidaId(@PathVariable Long comidaId) {
        boolean deleted = foodService.deleteByComidaId(comidaId);
        if (deleted) {
            return ResponseEntity.status(HttpStatus.OK).body("Deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food not found");
        }
    }
}