package com.JonanthaW.FoodFastApp.repository;

import com.JonanthaW.FoodFastApp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
