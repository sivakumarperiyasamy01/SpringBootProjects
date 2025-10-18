package com.EcommerceStorefront.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EcommerceStorefront.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
