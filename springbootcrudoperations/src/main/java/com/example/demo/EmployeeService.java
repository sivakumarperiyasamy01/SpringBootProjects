package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private final Employeerepository repo;

	public EmployeeService(Employeerepository repo) {
		super();
		this.repo = repo;
	}

	//get all data from database
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	// save 
	public Employee save(Employee emp) {
		return repo.save(emp);

	}

	public Employee getbyId(Long id) {
		return repo.findById(id).orElse(null);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

}
