package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {
	
	
	@GetMapping("/")
	public String show(Model model){
		model.addAttribute("gender", List.of("Male", "female", "other"));
		model.addAttribute("countries", List.of("Ind", "SA", "England"));
		model.addAttribute("hobbies", List.of("programming", "sleeping", "gaming"));
		return "Register";
	}

	
	
	
	@PostMapping("/register")
	public String register_data(
			@RequestParam String name, @RequestParam String email, @RequestParam String gender,
			@RequestParam String country, @RequestParam List<String> hobbies, @RequestParam String dob, Model model
			) {
		
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("gender", gender);
		model.addAttribute("country", country);
		model.addAttribute("hobbies", hobbies);
		model.addAttribute("dob", dob);
		return "success";
	}
}
	
	
	


