package com.sample.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.model.FoodEntity;

public interface FoodRepository extends JpaRepository<FoodEntity, Long> {

}
