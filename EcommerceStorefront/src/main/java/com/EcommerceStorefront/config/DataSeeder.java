package com.EcommerceStorefront.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.EcommerceStorefront.model.Category;
import com.EcommerceStorefront.model.Product;
import com.EcommerceStorefront.repo.CategoryRepo;
import com.EcommerceStorefront.repo.ProductRepo;

//Everything inside run() executes right after the Spring Boot application starts
//(after the context is ready, before the app fully runs).

@Component
public class DataSeeder implements CommandLineRunner {

	private ProductRepo productrepo;
	private CategoryRepo categoryrepo;

	// autowiring by constructor
	public DataSeeder(ProductRepo productrepo, CategoryRepo categoryrepo) {
		this.productrepo = productrepo;
		this.categoryrepo = categoryrepo;
	}

	@Override
	public void run(String... args) throws Exception {

		// delete the existing data present in db delete
		productrepo.deleteAll();
		categoryrepo.deleteAll();

		// add category to db
		Category electronics = new Category();
		electronics.setName("electronics");

		Category clothing = new Category();
		clothing.setName("cloths");

		Category Homeappliance = new Category();
		Homeappliance.setName("kitchenappliance");

		categoryrepo.saveAll(Arrays.asList(electronics, clothing, Homeappliance));

		// add dummy data into prduct db
		
		Product laptop = new Product();
		laptop.setName("Laptop");
		laptop.setDescription("high in demand newly arrived ");
		laptop.setImageurl("https://placehold.co/600x400");
		laptop.setPrice(60000.69);
		laptop.setCategory(electronics);

		Product watches = new Product();
		watches.setName("Casio");
		watches.setDescription("good quality long lasting battery ");
		watches.setImageurl("https://placehold.co/600x400");
		watches.setPrice(3000.00);
		watches.setCategory(electronics);

		Product cloths = new Product();
		cloths.setName("Jacket");
		cloths.setDescription("good quality used for winterseasons ");
		cloths.setImageurl("https://placehold.co/600x400");
		cloths.setPrice(5000.00);
		cloths.setCategory(clothing);

		Product Kitchen = new Product();
		Kitchen.setName("Refrigerator");
		Kitchen.setDescription("good life and 12 years warrenty ");
		Kitchen.setImageurl("https://placehold.co/600x400");
		Kitchen.setPrice(20000.00);
		Kitchen.setCategory(Homeappliance);

		productrepo.saveAll(Arrays.asList(laptop, watches, cloths, Kitchen));

	}

}
