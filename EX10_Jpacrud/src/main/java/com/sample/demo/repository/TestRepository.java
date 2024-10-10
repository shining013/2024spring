package com.sample.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.demo.entity.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long>{

}
