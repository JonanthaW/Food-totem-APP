package com.JonanthaW.FoodFastApp.repository;

import com.JonanthaW.FoodFastApp.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
    Optional<Coupon> findByCupom(String code);
}
