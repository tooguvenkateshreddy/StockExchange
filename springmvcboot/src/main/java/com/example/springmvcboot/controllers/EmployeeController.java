package com.example.springmvcboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springmvcboot.dao.EmployeeDao;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@GetMapping
	public String getEmployees(){
		System.out.println("inside the meployee");
		employeeDao.insertEmployee();
		return "employeeDetails";
				
	}
	
}
