package com.dailycodebuffer.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.jwt.entity.Category;
import com.dailycodebuffer.jwt.entity.Product;
import com.dailycodebuffer.jwt.service.CategoryService;
import com.dailycodebuffer.jwt.service.ProductService;

@RestController
@RequestMapping("/api")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductService productService;

	@GetMapping("/v1/category/fetchcategory/{id}")
	public Category fetchCategoryById(@PathVariable("id") String categoryID) {
		return categoryService.fetchCategoryById(Long.parseLong(categoryID));

	}

	@GetMapping("/v1/category/fetch")
	public List<Category> fetchCategoryList() {
		return categoryService.fetchCategory();
	}

	@GetMapping("/v1/product/category/{categoryId}")
	public List<Product> getProductsByCategoryId(@PathVariable long categoryId) {
		return productService.getProductsByCategoryId(categoryId);

	}

	@PostMapping("/v1/category/create")
	public Category saveCategory(@RequestBody Category category) {
		return categoryService.saveCategory(category);
	}

}
