package com.example.springmvcboot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus	;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {

	
	
	@RequestMapping("/login")
	public String login(@RequestParam String username, ModelMap model){
		//if(username.equals("hello")){
		//	System.out.println("corrent user name");
			model.addAttribute("username",username);
		
			
			//return "forward:employeeDetails/list";
			return "redirect:employeeDetails/list";
	//	}else{
		//	return "abc";
		//}
	}
	
	@RequestMapping("/logout")
	public String logout(SessionStatus sessionStatus){
		sessionStatus.setComplete();	// session.invalidate()
		return "abc";
	}
	
	
}
