package com.JonanthaW.FoodFastApp.repository;

import com.JonanthaW.FoodFastApp.entity.OrderReady;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderReadyRepository extends JpaRepository<OrderReady, Long> {
    Optional<OrderReady> deleteByProntosIdAndStatus(Long prontos_Id, String status);
}
