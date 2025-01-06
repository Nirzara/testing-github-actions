package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {

	public List<Employee> findAll();
	
	public List<Employee> findByCity(String city);
}
