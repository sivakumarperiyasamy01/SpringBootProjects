package com.EcommerceStorefront.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EcommerceStorefront.model.Product;
import com.EcommerceStorefront.service.ProductService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/products")
public class ProductController {

	ProductService productservice;

	public ProductController(ProductService productservice) {
		super();
		this.productservice = productservice;
	}

	// fetch all products

	@GetMapping
	public List<Product> getallproducts() {

		return productservice.fetchallproducts();

	}

	// fetch all products by category

	@GetMapping("category/{categoryid}")
	public List<Product> getproductbycategoryid(@PathVariable("categoryid")  Long id) {

		return productservice.fetchallproductsbycategory(id);

	}

}
