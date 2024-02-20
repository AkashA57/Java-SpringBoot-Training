package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SumController {
	
	@GetMapping({"/", "displaySumPage"})
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
		
		model.addAttribute("sums", sums);
		
		return "sum";//go to sum.jsp
		
	}

}
