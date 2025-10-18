package com.EcommerceStorefront.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.EcommerceStorefront.model.Product;
import com.EcommerceStorefront.repo.ProductRepo;

@Service
public class ProductService {

	ProductRepo productrepo;

	public ProductService(ProductRepo productrepo) {
		this.productrepo = productrepo;
	}

	// find all products
	public List<Product> fetchallproducts() {

		return productrepo.findAll();

	}

	// fetch all products based on Id
	public List<Product> fetchallproductsbycategory(Long id) {

		return productrepo.findByCategoryId(id);

	}

}
