package com.EcommerceStorefront.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EcommerceStorefront.model.Category;
import com.EcommerceStorefront.service.CategoryService;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

	CategoryService categoryservice;

	public CategoryController(CategoryService categoryservice) {
		super();
		this.categoryservice = categoryservice;
	}

	@GetMapping
	public List<Category> getallcategories() {

		return categoryservice.findallcategories();

	}

}
