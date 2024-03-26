package com.JonanthaW.FoodFastApp.repository;

import com.JonanthaW.FoodFastApp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, String> {
    Optional<Category> deleteBycategoriaId(Long categoryId);
}
