package com.JonanthaW.FoodFastApp.service;

import com.JonanthaW.FoodFastApp.entity.Coupon;
import com.JonanthaW.FoodFastApp.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;

    public Optional<Coupon> findCouponByName(String code) {
        return couponRepository.findByCupom(code);
    }

    public List<Coupon> getAllCoupon() {
        return couponRepository.findAll();
    }

    public Optional<Coupon> createCoupon(Coupon coupon) {
        return Optional.of(couponRepository.save(coupon));
    }

    public boolean deleteCoupon(String code) {
        couponRepository.deleteByCupom(code);
        return false;
    }
}
