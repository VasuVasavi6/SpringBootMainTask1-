package com.dailycodebuffer.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.jwt.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
