package com.JonanthaW.FoodFastApp.service;

import com.JonanthaW.FoodFastApp.entity.Food;
import com.JonanthaW.FoodFastApp.entity.OrderReady;
import com.JonanthaW.FoodFastApp.repository.FoodRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }

    public List<Food> findAllByCategoriaId(Long categoriaId) {
        return foodRepository.findAllByCategoriaId(categoriaId);
    }


    public Optional<Food> createFood(Food food) {
        return Optional.of(foodRepository.save(food));
    }


    public boolean deleteByComidaId(Long comidaId) {
        foodRepository.deleteByComidaId(comidaId);
        return false;
    }
}
