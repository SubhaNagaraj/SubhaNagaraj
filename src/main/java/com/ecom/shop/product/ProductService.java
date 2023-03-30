package com.ecom.shop.product;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ProductService {
	
	
	@Autowired
	ProductRepository productRepository;

	public Iterable<ProductEntity> fetchAllRecords() {
		
		return productRepository.findAll();
	}

	public ProductEntity add(ProductEntity product) {
		
		return productRepository.save(product);
	}

	public Optional<ProductEntity> findById(Long id) {
		
		return productRepository.findById(id);
	}

}
