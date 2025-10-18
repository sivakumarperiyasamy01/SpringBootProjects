package com.EcommerceStorefront.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EcommerceStorefront.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
	
	List<Product>findByCategoryId(Long id);

}
