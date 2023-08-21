package com.sen.kcalcop.record.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sen.kcalcop.record.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

}
