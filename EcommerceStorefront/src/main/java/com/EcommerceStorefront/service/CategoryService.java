package com.EcommerceStorefront.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.EcommerceStorefront.model.Category;
import com.EcommerceStorefront.repo.CategoryRepo;

@Service
public class CategoryService {

	CategoryRepo categoryrepo;

	public CategoryService(CategoryRepo categoryrepo) {

		this.categoryrepo = categoryrepo;
	}

	// fetch all categories
	public List<Category> findallcategories() {
		return categoryrepo.findAll();

	}

}
