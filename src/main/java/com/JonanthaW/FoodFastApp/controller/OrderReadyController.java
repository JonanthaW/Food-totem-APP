package com.JonanthaW.FoodFastApp.controller;

import com.JonanthaW.FoodFastApp.entity.OrderReady;
import com.JonanthaW.FoodFastApp.service.OrderReadyService;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/balcao")
public class OrderReadyController {
    @Autowired
    private OrderReadyService orderReadyService;

    @GetMapping
    public List<OrderReady> getAllOrderReady() {
        return orderReadyService.getAllOrderReady();
    }

    @PostMapping
    public Optional<OrderReady> createOrderReady(@RequestBody OrderReady orderReady) {
        return orderReadyService.createOrderReady(orderReady);
    }
}
