package com.JonanthaW.FoodFastApp.controller;

import com.JonanthaW.FoodFastApp.entity.Category;
import com.JonanthaW.FoodFastApp.service.CategoryService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    //@Cacheable(value = "category")
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @DeleteMapping("/delete/{categoryId}")
    @CacheEvict(value = "category", key = "#categoryId")
    public ResponseEntity<String> deleteBycategoriaId(@PathVariable Long categoryId) {
        boolean deleted = categoryService.deleteBycategoriaId(categoryId);
        if (deleted) {
            return ResponseEntity.status(HttpStatus.OK).body("Deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Category not found");
        }
    }
}
