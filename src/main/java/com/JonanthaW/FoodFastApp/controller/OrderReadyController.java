package com.JonanthaW.FoodFastApp.controller;

import com.JonanthaW.FoodFastApp.entity.OrderReady;
import com.JonanthaW.FoodFastApp.service.OrderReadyService;
import jakarta.transaction.Transactional;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Transactional
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

    @DeleteMapping("/delete/{prontos_Id}")
    public ResponseEntity<String> deleteByProntosIdAndStatus(@PathVariable Long prontos_Id, String status) {
        boolean deleted = orderReadyService.deleteByProntosIdAndStatus(prontos_Id, status);
        if (deleted) {
            return ResponseEntity.status(HttpStatus.OK).body("Deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order not found");
        }
    }
}
