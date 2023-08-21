package com.sen.kcalcop.record.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sen.kcalcop.record.entity.CustomFood;

public interface CustomFoodRepository extends JpaRepository<CustomFood, Integer> {

}
