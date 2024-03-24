package com.JonanthaW.FoodFastApp.controller;

import com.JonanthaW.FoodFastApp.entity.Coupon;
import com.JonanthaW.FoodFastApp.service.CouponService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Transactional
@RestController
@RequestMapping("/cupom")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @GetMapping("/{code}")
    public ResponseEntity<?> getCouponByName(@PathVariable String code) {
        if (code == null || code.trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Coupon code is required.");
        }
        Optional<Coupon> couponOptional = couponService.findCouponByName(code);
        if (couponOptional.isPresent()) {
            return ResponseEntity.ok(couponOptional.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Coupon not found.");
        }
    }

    @GetMapping
    public List<Coupon> getAllCoupon() {
        return couponService.getAllCoupon();
    }

    @PostMapping("/criar")
    public Optional<Coupon> createCoupon(@RequestBody Coupon coupon) {
        return couponService.createCoupon(coupon);
    }

    @DeleteMapping("/delete/{code}")
    public ResponseEntity<String> deleteCoupon(@PathVariable String code) {
        boolean deleted = couponService.deleteCoupon(code);
        if (deleted) {
            return ResponseEntity.status(HttpStatus.OK).body("Deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Coupon not found");
        }
    }
}
