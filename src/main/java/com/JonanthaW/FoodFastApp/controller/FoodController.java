package com.JonanthaW.FoodFastApp.controller;

import com.JonanthaW.FoodFastApp.entity.Category;
import com.JonanthaW.FoodFastApp.entity.Food;
import com.JonanthaW.FoodFastApp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comida")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    private List<Food> getAllFood() {
        return foodService.getAllFood();
    }

    /*
    @GetMapping("/tipo/{code}")
    public ResponseEntity<?> getFoodByCategoriaId(@PathVariable Long categoriaId) {
        List<Food> foodOptional = foodService.findAllByCategoriaId(categoriaId);
        if (foodOptional != null) {
            return ResponseEntity.ok(foodOptional);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food category not found.");
        }
    }*/
}
