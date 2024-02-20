package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.EmployeeDTO;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	String displayLoginPage() {
		
		return "login"; //login.jsp
	}
	
	@PostMapping("login")
	String authenticate(@RequestParam String email, @RequestParam String pswd, Model model) {
		
		//System.out.println(email + "  " + pswd);
		
		EmployeeDTO employeeDTO = employeeService.authenticate(email, pswd);
		
		
		if(employeeDTO != null) {
			model.addAttribute("employeeDTO", employeeDTO);
			return "congrats";
		}
		return "login";
		
	}
	
	@GetMapping("showAll")
	String showAll(Model model){
		
		List<EmployeeDTO> listOfEmp=employeeService.giveAllEmp();
		
		model.addAttribute("listOfEmp", listOfEmp);
		
		
		return "showAll";//showAll.jsp
		
	}
	
	@GetMapping("deleteEmployee")
	String delEmployee(@RequestParam int employeeID,Model model){
		
		employeeService.deleteEmp(employeeID);
		
//		List<EmployeeDTO> listOfEmp=employeeService.giveAllEmp();
//		model.addAttribute("listOfEmp", listOfEmp);		
//		return "showAll";//showAll.jsp
		return "redirect:showAll";
		
	}
	
	@GetMapping("register")
	String displayRegistrationPage(){
		
		return "registration";
		
	}
	
	@PostMapping("register")
	String doRegistration(@ModelAttribute EmployeeDTO empDTO){
		
		employeeService.saveEmp(empDTO);
		
		return "login";
		
	}
	
	@GetMapping("updateEmployee")
	String displayEditPage(@RequestParam int employeeID, Model model){
		
		EmployeeDTO empDTO = employeeService.requestInfo(employeeID);
		
		model.addAttribute("empDTO", empDTO);
		return "editPage";
		
	}
	
	@PostMapping("updateEmployee")
	String updateInfo(@ModelAttribute EmployeeDTO empDTO, Model model){
		
		employeeService.editEmp(empDTO);
		
		return "redirect:showAll";
		
	}
	

}
