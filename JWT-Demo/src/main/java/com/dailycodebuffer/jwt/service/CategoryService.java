package com.dailycodebuffer.jwt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dailycodebuffer.jwt.entity.Category;
import com.dailycodebuffer.jwt.entity.Product;

@Service
public interface CategoryService {

	List<Category> fetchCategory();

	Category fetchCategoryById(Category categoryID);

	Category fetchCategoryById(Long categoryID);

	// List<Product> findByCategoryId(long categoryId);

	// Product getProductById2(Long categoryId);

	// List<Product> getProducts(Category category);
	Product getProductById(Long categoryId);

	Category saveCategory(Category category);

}
