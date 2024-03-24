package com.JonanthaW.FoodFastApp.service;

import com.JonanthaW.FoodFastApp.entity.Food;
import com.JonanthaW.FoodFastApp.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }
    /*
    public List<Food> findAllByCategoriaId(Long categoriaId) {
        return foodRepository.findAllByCategoriaId(categoriaId);
    }
     */
}
