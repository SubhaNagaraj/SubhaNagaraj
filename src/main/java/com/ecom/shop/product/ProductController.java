package com.ecom.shop.product;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	
	@GetMapping("/all")
	public Iterable<ProductEntity> fetchAll()
	{
		return productService.fetchAllRecords(); 
	}
	
	
	@PostMapping("/post")
	public ProductEntity  fetchAll(@RequestBody ProductEntity product)
	{
		return productService.add(product);
	}
	
	@GetMapping("/get/{id}")
	public Optional<ProductEntity> findId(@PathVariable Long id)
	{
		return productService.findById(id);
	}
	
	
	
	
	
	

}
