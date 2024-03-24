package com.JonanthaW.FoodFastApp.service;

import com.JonanthaW.FoodFastApp.entity.OrderReady;
import com.JonanthaW.FoodFastApp.repository.OrderReadyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderReadyService {
    @Autowired
    private OrderReadyRepository orderReadyRepository;

    public List<OrderReady> getAllOrderReady() {
        return orderReadyRepository.findAll();
    }

    public Optional<OrderReady> createOrderReady(OrderReady orderReady) {
        return Optional.of(orderReadyRepository.save(orderReady));
    }
}
