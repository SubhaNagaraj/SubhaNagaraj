package com.ecom.shop.product;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity,Integer> {

	Optional<ProductEntity> findById(Long id);
	
	
	

	
}
