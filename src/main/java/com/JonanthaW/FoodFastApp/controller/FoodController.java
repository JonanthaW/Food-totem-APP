package com.JonanthaW.FoodFastApp.controller;

import com.JonanthaW.FoodFastApp.entity.Food;
import com.JonanthaW.FoodFastApp.service.FoodService;
import jakarta.transaction.Transactional;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Transactional
@RestController
@RequestMapping("/comida")
public class FoodController {

    private FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }


    @GetMapping
    @Cacheable(value = "Food")
    public List<Food> getAllFood() {
        try {
            return foodService.getAllFood();
        } catch (Exception e) {
            // Log the exception or handle it accordingly
            e.printStackTrace(); // Example: printing the stack trace
            // You can also throw a custom exception or return a default value
            return Collections.emptyList(); // Returning an empty list as a default value
        }
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
    @CachePut(value = "Food")
    public Optional<Food> createFood(@RequestBody Food food) {
        return foodService.createFood(food);
    }

    @DeleteMapping("/delete/{comidaId}")
    @CacheEvict(value = "Food", key = "#comidaId")
    public ResponseEntity<String> deleteByComidaId(@PathVariable Long comidaId) {
        boolean deleted = foodService.deleteByComidaId(comidaId);
        if (deleted) {
            return ResponseEntity.status(HttpStatus.OK).body("Deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food not found");
        }
    }
}