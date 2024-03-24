package com.JonanthaW.FoodFastApp.repository;

import com.JonanthaW.FoodFastApp.entity.Category;
import com.JonanthaW.FoodFastApp.entity.Coupon;
import com.JonanthaW.FoodFastApp.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FoodRepository extends JpaRepository<Food,Long> {
    List<Food> findAllByCategoriaId(Long categoriaId);
    Optional<Food> deleteByComidaId(Long comidaId);
}
