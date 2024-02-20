package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.EmployeeDao;
import com.dao.EmployeeEntity;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@GetMapping("/")
	String displayLoginPage() {
		
		return "login"; //login.jsp
	}
	
	@PostMapping("login")
	String authenticate(@RequestParam String email, @RequestParam String pswd, Model model) {
		
		System.out.println(email + "  " + pswd);
		
		EmployeeEntity employeeEntity = employeeDao.authenticate(email, pswd);
		
		if(employeeEntity != null) {
			return "congrats";
		}
		return "login";
		
	}

}
