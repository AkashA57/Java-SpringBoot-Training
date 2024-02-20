package com.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.main.dto.StudentDTO;
import com.main.entity.StudentEntity;
import com.main.service.StudentService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	StudentService studentService;
	
	
	
	@GetMapping("showStudents")
	
	String showAll(Model model){	
		
	   List<StudentDTO>   studentDTOlist=studentService.FetchAllStudents();	   
	  
	   model.addAttribute( "listOfStu"  ,studentDTOlist);
		
		return "showStudent";
	}
	
	@GetMapping("register")
	String displayRegistrationPage(){
		
		return "student_home";
		
	}
	
	@PostMapping("register")
	String doRegistration(@ModelAttribute StudentDTO studentDTO){
		
		studentService.saveStudent(studentDTO);
		
		return "redirect:showStudents";
		
	}
	
	@GetMapping("deleteStudent")
	String delStudent(@RequestParam int studentSSN,Model model){
		
		studentService.deleteStudent(studentSSN);
		
		return "afterDelete";
		
	}
	
	@GetMapping("updateStudent")
	String displayEditPage(@RequestParam int studentSSN, Model model){
		
		StudentDTO studentDTO = studentService.requestInfo(studentSSN);
		
		model.addAttribute("studentDTO", studentDTO);
		return "updateStudent";
		
	}
	
	@PostMapping("updateStudent")
	String updateInfo(@ModelAttribute StudentDTO studentDTO, Model model){
		
		studentService.editStudent(studentDTO);
		
		return "redirect:showStudents";
		
	}
	
}
	
	
	
	
	

	


