package com.main.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.main.dto.EmployeeDTO;
import com.main.entity.EmployeeEntity;
import com.main.service.EmployeeService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	EmployeeService  employeeService;
	
	@GetMapping("/")
	String displayLoginPage() {
		
		return "login"; //login.jsp
	}
	
	@PostMapping("login")
	String authenticate(@RequestParam String email, @RequestParam String pswd, HttpSession session/*Model model**/) {
		
		//System.out.println(email + "  " + pswd);
		
		EmployeeDTO employeeDTO = employeeService.authenticate(email, pswd);
		
		
		if(employeeDTO != null) {
			//model.addAttribute("employeeDTO", employeeDTO);
			session.setAttribute("employeeDTO", employeeDTO);
			return "congrats";
		}
		return "login";
		
	}
	
	
	@GetMapping("showEmployees")
	
	String showAll(Model model, HttpSession session){	
		
		EmployeeDTO emp = (EmployeeDTO)session.getAttribute("employeeDTO");
		if(emp != null) {
		
			List<EmployeeDTO> employeeDTOlist=employeeService.FetchAllEmployees();	   
	  
			model.addAttribute( "listOfEmp"  ,employeeDTOlist);
		
		return "showAll";//showAll.jsp
		}
		else {
			return "login";
		}
		
	}
	
	@GetMapping("register")
	String displayRegistrationPage(){
		
		return "registration";
		
	}
	
	@PostMapping("register")
	String doRegistration(@ModelAttribute EmployeeDTO empDTO){
		
		employeeService.saveEmp(empDTO);
		
		return "redirect:showEmployees";
		
	}
	
	@GetMapping("deleteEmployee")
	String delEmployee(@RequestParam int employeeID,Model model){
		
		employeeService.deleteEmp(employeeID);
		
		return "redirect:showEmployees";
		
	}
	
	@GetMapping("updateEmployee")
	String displayEditPage(@RequestParam int employeeID, Model model){
		
		EmployeeDTO employeeDTO = employeeService.requestInfo(employeeID);
		
		model.addAttribute("employeeDTO", employeeDTO);
		return "editPage";
		
	}
	
	@PostMapping("updateEmployee")
	String updateInfo(@ModelAttribute EmployeeDTO empDTO, Model model){
		
		employeeService.editEmp(empDTO);
		
		return "redirect:showEmployees";
		
	}
	
	@GetMapping("/logout")
	String logout(Model model, HttpSession session) {
		if(session!=null) 
			session.invalidate();
			model.addAttribute("msg", "User has been logged out!!!");
			
		return "login";
	}
	
}
	
	
	
	
	

	


