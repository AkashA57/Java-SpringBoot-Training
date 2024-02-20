package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {
	
	@GetMapping("hello")
	String displayHello(){
		
		return "helloJsp";//go to helloJsp.jsp
		
	}
	
	@GetMapping("hello2")
	String displayHello2(){
		
		return "helloJsp2";//go to helloJsp.jsp
		
	}
	
	@GetMapping("displayFactorialPage")
	String displayFactPage(){
		
		return "fact";
		
	}
	
	@PostMapping("factorial")
	String calFactorial(HttpServletRequest request,Model model){
		
		String num=request.getParameter("num");
		int number=Integer.parseInt(num);
		int factorial=1;
		for(int i=2;i<=number;i++){
			factorial=factorial*i;
			
		}
		model.addAttribute("factorial", factorial);
		
		
		return "fact";//go to fact.jsp
		
	}

}
