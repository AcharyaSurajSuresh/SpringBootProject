package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/Getemployees")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployee();
	}
	
	@PostMapping("/employee")
	public void saveEmployee(@RequestBody Employee ee)
	{
		service.saveEmployee(ee);
	}
	
	@PostMapping("/deleteemployee/{id}")
	public void deleteEmployee(@PathVariable String id)
	{
		service.deleteEmployee(id);
	}

}
