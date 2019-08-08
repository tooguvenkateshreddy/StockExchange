package com.example.springmvcboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController1 {

	@RequestMapping(value="/values")
	public String getEmployeeList(){
		System.out.println("inside abc");
		// call the service
		//workflow
		//web-inf/jsp/abc.jsp
		
		 return "abc"; 
	}	
	
	
	
	
	
	@RequestMapping(value="/values0")
	public ModelAndView getEmployeeList0(){
		System.out.println("inside abc");
		ModelAndView mv=new ModelAndView(); 
		mv.setViewName("abc");
		mv.addObject("messaage", "welcome to mvc");
		return mv;
	}
	
	@RequestMapping(value="/values1")
	public String getEmployeeList1(Model model){
		model.addAttribute("message", "hello");
		model.addAttribute("message2", "hi");
		System.out.println(model);
		System.out.println("inside abc");
		 return "abc"; 
	}
	
	@RequestMapping(value="/values2")
	public ModelAndView getEmployeeList2(ModelMap modelMap){
		modelMap.addAttribute("message", "hello");
		modelMap.addAttribute("message2", "welcome");
		System.out.println("inside abc");
		//return "abc";
		 return new ModelAndView("abc",modelMap); 
	}
	
}
