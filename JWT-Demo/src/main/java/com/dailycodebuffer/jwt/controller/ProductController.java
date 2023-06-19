package com.dailycodebuffer.jwt.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.jwt.dto.ProductDTO;
import com.dailycodebuffer.jwt.entity.Category;
import com.dailycodebuffer.jwt.entity.Product;
import com.dailycodebuffer.jwt.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductService productService;

	@PostMapping("/v1/product/create2")
	public Product createOrder(@RequestBody ProductDTO request) {
		Product productobj = new Product();
		BeanUtils.copyProperties(request, productobj);
		productobj.setPro_id(request.getPro_id());
		productobj.setProName(request.getProName());
		productobj.setProDescription(request.getProDescription());
		productobj.setPrice(request.getPrice());
		// productobj.setCategory(request.getCategoryId());
		Category category = new Category();
		category.setId(request.getCategoryId());
		productobj.setCategory(category);
		Product savedOrder = productService.saveProduct(productobj);
		return savedOrder;
	}

	@DeleteMapping("/v1/product/deletebyid/{id}")
	public void deleteProductById(@PathVariable("ID") Long productId) {
		productService.deleteProductByID(productId);
	}

	@DeleteMapping("/v1/product/deleteall")
	public void deleteProducts() {
		productService.deleteProducts();
	}

	@GetMapping("/v1/product/fetchbyid/{id}")
	public Product fetchProductById(@PathVariable("id") String productID) {
		return productService.fetchProductById(Long.parseLong(productID));
	}

	@GetMapping("/v1/product/fecth")
	public List<Product> fetchProductList() {
		return productService.fetchProduct();
	}

	@PostMapping("/v1/product/create")
	public Product saveProduct(@RequestBody Product product /* , @RequestParam Long CategoryID */) {
		return productService.saveProduct(product);
	}

	@PutMapping("/v1/product/update")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

}
