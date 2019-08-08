package com.example.springmvcboot.service;

import java.util.List;

import com.example.springmvcboot.model.Employee;



public interface EmployeeDetailService {

	public List<Employee> getEmployeeDetails();
	public Employee insertEmployee(Employee employee);
	public Employee getEmployeeDetailById(int id);
}
