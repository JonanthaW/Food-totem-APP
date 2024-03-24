package com.JonanthaW.FoodFastApp.controller;

import com.JonanthaW.FoodFastApp.entity.Category;
import com.JonanthaW.FoodFastApp.entity.Coupon;
import com.JonanthaW.FoodFastApp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    private List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }
}
