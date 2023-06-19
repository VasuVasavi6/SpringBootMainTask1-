package com.dailycodebuffer.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.jwt.entity.Category;
import com.dailycodebuffer.jwt.entity.Product;
import com.dailycodebuffer.jwt.repository.CategoryRepo;
import com.dailycodebuffer.jwt.repository.ProductRepo;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepository;
	@Autowired
	private ProductRepo productRepository;

	@Override
	public List<Category> fetchCategory() {
		return categoryRepository.findAll();
	}

	@Override
	public Category fetchCategoryById(Category categoryID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category fetchCategoryById(Long categoryID) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(categoryID).get();
	}

	@Override
	public Product getProductById(Long categoryId) {
		// TODO Auto-generated method stub
		return productRepository.findById(categoryId).get();
	}

	// @Override
	@Override
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

}
