package com.example.springmvcboot.restcontroller;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmvcboot.model.Employee;

@RestController	
public class GreetingResource {

	@GetMapping("/greet")
	public String greet(){
		System.out.println("hi");
		return "hi ehllo";
	}
	
	@GetMapping("/greetObject")
	public Employee greetEmployee(){
		Employee e=new Employee();
		e.setEmployeeId(1001);
		e.setName("ramesh");
		System.out.println("hi");
		return e;
	}
	
	// post insert
	@PostMapping("/greetObject")
	public Employee insertEmployee(@RequestBody Employee employee){
		employee.setEmployeeId(1001);
		return employee;
	}
	
	// update
	@PutMapping("/greetObject")
	public Employee updateEmployee(@RequestBody Employee employee){
		System.out.println(employee.getName());
		employee.setName("suresh123");
		return employee;
	}
	
	
	@DeleteMapping("/greeting")
	public String deleteEmployee(){
		System.out.println();
		return "employee is deleted";
	}

	
	// add
	//edit
	// delet
	
	
	
	
	
	
	
}
