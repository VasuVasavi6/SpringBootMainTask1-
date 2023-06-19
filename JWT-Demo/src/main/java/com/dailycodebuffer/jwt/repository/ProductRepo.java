package com.dailycodebuffer.jwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.jwt.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	List<Product> findByCategoryId(long categoryId);

	// Product save(ProductDTO product);

}
