package com.example.springmvcboot.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springmvcboot.model.Employee;



@Repository("dao")
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertEmployee(){
		jdbcTemplate.update("insert into emp45 value(56,'rakesh',34)");
	}
	
private List<Employee> employees=new ArrayList<Employee>();
	
	public EmployeeDao(){
		Employee e1=new Employee(1001,"ramesh",new Date(), 5464.45f, "sdfds@gmail.com", "developer");
		Employee e2=new Employee(1002,"suresh",new Date(), 5464.45f, "sdfds@gmail.com", "developer");
		Employee e3=new Employee(1003,"dhinesh",new Date(), 5464.45f, "sdfds@gmail.com", "developer");
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
	}
	
	public List<Employee> getEmployeeDetails() {
		return employees;
	}
	
	public Employee insertEmployee(Employee employee){
		employees.add(employee);
		return employee;
	}

	public Employee getEmployeeDetailById(int id) {
		return employees.get(1);
		
	}
	
}
