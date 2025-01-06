package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entities.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;

	@GetMapping("")
	public List<Employee> getAllEmployees(){
		return employeeDao.findAll();
	}
	
	@GetMapping("/input/{city}")
	public List<Employee> getAllEmployeesByCity(@PathVariable String city){
		return employeeDao.findByCity(city);
	}
	
}
