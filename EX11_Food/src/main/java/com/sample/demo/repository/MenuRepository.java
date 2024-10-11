package com.sample.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.model.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {
	public List<MenuEntity> findAllByFoodId(Long foodId);
}
