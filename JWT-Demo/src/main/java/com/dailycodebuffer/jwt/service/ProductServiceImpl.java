package com.dailycodebuffer.jwt.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.jwt.entity.Product;
import com.dailycodebuffer.jwt.repository.CategoryRepo;
import com.dailycodebuffer.jwt.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

//	public static ProductDTO toProductDTO(Product product) {
//		ProductDTO productDTO = new ProductDTO();
//		productDTO.setPro_id(product.getPro_id());
//		productDTO.setProName(product.getProName());
//		productDTO.setProDescription(product.getProDescription());
//		productDTO.setPrice(product.getPrice());
//		productDTO.setCategoryId(product.getCategoryID().getId());
//		return productDTO;
//	}

	@Autowired
	private ProductRepo productRepository;

	@Autowired
	private CategoryRepo categoryRepository;

	@Override
	public void deleteProductByID(Long productID) {
		productRepository.deleteById(productID);
		System.out.println(productID + " is deleted Successfully");

	}

// Delete operation

	@Override
	public void deleteProducts() {
		productRepository.deleteAll();
		System.out.println("Products were deleted Successfully");
	}

	// @Override
	@Override
	public List<Product> fetchProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product fetchProductById(Long productID) {
		return productRepository.findById(productID).get();
	}

//	@Override
//	public List<ProductDTO> getProducts() {
//		List<Product> products = productRepository.findAll();
//		List<ProductDTO> productDTOs = new ArrayList<>();
//
//		for (Product product : products) {
//			ProductDTO productDTO = new ProductDTO();
//			productDTO.setPro_id(product.getPro_id());
//			productDTO.setPrice(product.getPrice());
//			productDTO.setProName(product.getProName());
//			productDTO.setProDescription(product.getProDescription());
//			productDTO.setCategoryId(product.getCategoryID().getId()); // Set categoryId instead of the whole Category
//																		// object
//
//			productDTOs.add(productDTO);
//		}
//
//		return productDTOs;
//	}

	@Override
	public List<Product> findByCategoryId(long categoryId) {
		// TODO Auto-generated method stub
		return productRepository.findByCategoryId(categoryId);
	}

//	@Override
//	public Product saveProduct(ProductDTO product) {
//		// TODO Auto-generated method stub
//		return productRepository.save(product);
//	}

	@Override
	// @Override
	public List<Product> getProductsByCategoryId(long categoryId) {

		return productRepository.findByCategoryId(categoryId);

	}

	// @Override
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	// @Override
	@Override
	public Product updateProduct(Product product) {
		Product productID = productRepository.findById(product.getPro_id()).get();

		System.out.println(productID);
		if (Objects.nonNull(product.getPro_id())) {
			productID.setPro_id(product.getPro_id());
		}

		if (Objects.nonNull(product.getProName()) && !"".equalsIgnoreCase(product.getProName())) {
			productID.setProName(product.getProName());
		}

		if (Objects.nonNull(product.getProDescription()) && !"".equalsIgnoreCase(product.getProDescription())) {

			productID.setProDescription(product.getProDescription());
		}

		return productRepository.save(productID);
	}
}
