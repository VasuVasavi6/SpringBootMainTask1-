package com.dailycodebuffer.jwt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dailycodebuffer.jwt.entity.Product;

@Service
public interface ProductService {
	// Delete By Id operation
	void deleteProductByID(Long productID);

	// Delete operation
	void deleteProducts();

	// Read operation
	List<Product> fetchProduct();

//	// FetchById operation
	Product fetchProductById(Long productID);

//
//	// Fetch products by category ID
//	List<Product> getProductsByCategoryId(Long categoryId);

	// public List<ProductDTO> getProducts();
	List<Product> findByCategoryId(long categoryId);

	List<Product> getProductsByCategoryId(long categoryId);

	// Product saveProduct(ProductDTO product);

	// Save operation
	Product saveProduct(Product product);

	// Update operation
	Product updateProduct(Product product);

}
