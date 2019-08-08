package com.example.springmvcboot.controller;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvcboot.model.Employee;
import com.example.springmvcboot.service.EmployeeDetailService;



@Controller
@RequestMapping("/employeeDetails")
public class EmployeeDetailsController {
	
	@Autowired
	private EmployeeDetailService employeeDetailService;
	
	@RequestMapping("/list")
	public String getEmployeeDetails(
		//	HttpSession session, 
			ModelMap model){
	//	System.out.println(session.getId());
		//System.out.println(username);
		//System.out.println("inside list."+session.getAttribute("username"));
	//	System.out.println("inside list."+username);
		List <Employee>employees=employeeDetailService.getEmployeeDetails();
		model.addAttribute("emp123",employees);
		return "employeeDetails";
	}
	
// http://localhost:8471/employeeDetails/employee?id=1001
	
	@RequestMapping("/employee")
	public String getEmployeeDetailsById(@RequestParam int id, Model model){
		System.out.println(id);
		Employee e=employeeDetailService.getEmployeeDetailById(id);
		model.addAttribute("employee",e);
		return "employeeView";
	}
	
}
