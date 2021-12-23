package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> getAllEmployee()
	{
		return repository.findAll();
	}

	public void saveEmployee(Employee e)
	{
		repository.save(e);
	}
	
	public void deleteEmployee(String id)
	{
		repository.deleteById(id);
	}
}
