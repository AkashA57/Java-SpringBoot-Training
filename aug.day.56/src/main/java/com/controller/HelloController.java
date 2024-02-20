package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("/")
	String displayHelloPage() {
		return "helloJsp";
	}
	
	@GetMapping("jsp2")
	String displayHelloPage2() {
		return "helloJsp2";
	}
	
	@GetMapping({"displaySumPage"})
	String displaySumPage(){
		
		return "sum";
		
	}
	
	@PostMapping("sum")
	String calSum(HttpServletRequest request,Model model){
		
		String stringNum1=request.getParameter("num1");
		String stringNum2=request.getParameter("num2");
		
		int num1=Integer.parseInt(stringNum1);
		int num2=Integer.parseInt(stringNum2);
		
		int sums = num1 + num2;
		
		model.addAttribute("text1", "The sum of");
		model.addAttribute("num1", num1);
		model.addAttribute("text2", "and");
		model.addAttribute("num2", num2);
		model.addAttribute("text3", "is");
		model.addAttribute("sums", sums);
		
		return "sum";//go to sum.jsp
		
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
		
		model.addAttribute("text1", "The factorial of");
		model.addAttribute("number", number);
		model.addAttribute("text3", "is");
		model.addAttribute("factorial", factorial);
		
		
		return "fact";//go to fact.jsp
		
	}
	
	@GetMapping("loginPage")
	String displayLoginPage() {
		
		return "login"; //login.jsp
	}
	
	@PostMapping("congratulation")
	String authenticate(@RequestParam String email, @RequestParam String pswd, Model model) {
		
		System.out.println(email + "   " + pswd);
		
		if(email.equals("root@gmail.com") && pswd.equals("root")) {
			model.addAttribute("email", email);
			model.addAttribute("pswd", pswd);
			
			return "congrats";
		}
		
		model.addAttribute("Sorry", "Sorry, please try again!!");
		return "login";
		
	}
	
	
}
