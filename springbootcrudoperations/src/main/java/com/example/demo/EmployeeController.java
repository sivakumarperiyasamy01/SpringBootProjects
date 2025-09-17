package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

	private EmployeeService service;

	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String home(Model model) {

		model.addAttribute("employees", service.getAllEmployees());
		return "index";
	}

	@GetMapping("/add")
	public String addForm(Model model) {

		model.addAttribute("employee", new Employee());
		return "add";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute Employee employee) {

		service.save(employee);
		return "redirect:/";

	}

	@GetMapping("/edit/{id}")
	public String editform(@PathVariable Long id, Model model) {
		model.addAttribute("employee", service.getbyId(id));
		return "edit";
	}

	@PostMapping("/update/{id}")
	public String update(@PathVariable Long id, @ModelAttribute Employee employee) {
		employee.setId(id);
		service.save(employee);
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		service.delete(id);
		return "redirect:/";
	}

}
