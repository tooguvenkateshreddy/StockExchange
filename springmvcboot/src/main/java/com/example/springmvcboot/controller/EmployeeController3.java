package com.example.springmvcboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.springmvcboot.model.Employee;


@Controller
@RequestMapping(value = "/employee3")
public class EmployeeController3 {
	
	@ModelAttribute
	public void setValues(Model model){
		System.out.println("inside set model");
		Employee e1=new Employee();
		e1.setSalary(345345.45f);
		model.addAttribute("employee", e1);
	}
	
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public ModelAndView forms() {
		System.out.println("forms");
		 return new ModelAndView("employeeForm");
	   
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String submit(@ModelAttribute("employee") Employee employee, Model model) {
		System.out.println(employee);
	//	model.addAttribute("name", employee.getName());
		 return "employeeView";
	}
	
	
}


