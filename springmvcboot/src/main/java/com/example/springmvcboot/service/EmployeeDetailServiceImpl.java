package com.example.springmvcboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmvcboot.dao.EmployeeDao;
import com.example.springmvcboot.model.Employee;



@Service
public class EmployeeDetailServiceImpl implements EmployeeDetailService {

	@Autowired
	private EmployeeDao employeeDetailsDao;
	
	public List<Employee> getEmployeeDetails() {
		return employeeDetailsDao.getEmployeeDetails();
	}

	public Employee insertEmployee(Employee employee) {
		return employeeDetailsDao.insertEmployee(employee);
	}
	
	public Employee getEmployeeDetailById(int id){
		return employeeDetailsDao.getEmployeeDetailById(id);
	}

}
