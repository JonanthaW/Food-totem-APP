package com.JonanthaW.FoodFastApp.service;

import com.JonanthaW.FoodFastApp.entity.Category;
import com.JonanthaW.FoodFastApp.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    public boolean deleteBycategoriaId(Long categoryId) {
        categoryRepository.deleteBycategoriaId(categoryId);
        return false;
    }
}
