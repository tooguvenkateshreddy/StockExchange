package com.example.springmvcboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvcboot.model.Employee;
import com.example.springmvcboot.service.EmployeeDetailService;

@Controller
public class EmployeeRegistrationController {

	@Autowired
	private EmployeeDetailService employeeDetailService;
	
	@ModelAttribute("designations")
	public List<String> setValues(){
		List<String> designations=new ArrayList<String>();
		designations.add("developer");
		designations.add("tester");
		designations.add("manager");
		return designations;
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public String getEmployeeForm(ModelMap model) {
		System.out.println("add employee");
		Employee e=new Employee();
		//e.setEmail("sdfsf");
	//	e.setSalary(4564.56f);
		model.addAttribute("e1", e);
		return "employeeForm";
		
	}
	
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String formHandler(@Valid Employee employee, 
			BindingResult result, Model model) {
		System.out.println(employee);
		if(result.hasErrors()){
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			model.addAttribute("e1", employee);
			return "employeeForm";
		}
		employeeDetailService.insertEmployee(employee);
		//model.addAttribute("name", employee.getName());
		 return "employeeView";
	}
	
}
