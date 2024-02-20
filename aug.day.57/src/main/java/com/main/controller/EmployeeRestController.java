package com.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.main.dto.EmployeeDTO;
import com.main.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
		@Autowired
		EmployeeService  employeeService;
	
		@GetMapping("showRestEmployee")
		EmployeeDTO showEmp(){
			
			EmployeeDTO employeeDTO = employeeService.authenticate("gram@yahoo.com", "root");
			
			return employeeDTO;		
			
		}
		
		@GetMapping("allRestEmployee")
		
		List<EmployeeDTO> showAll(){	
			
			List<EmployeeDTO> employeeDTOlist=employeeService.FetchAllEmployees();	
		  
		  	  
		  
		return employeeDTOlist;	
		
		}
		
		@GetMapping("employeeRestFind/{id}") //444/employees/8

		EmployeeDTO showEmp(@PathVariable int id){	
		  
			EmployeeDTO employeeDTO = employeeService.requestInfo(id);
		  
		  
		  return employeeDTO;
		}


		@PostMapping("employeeRestInsert")

		EmployeeDTO insertEmp(@RequestBody EmployeeDTO emp){	
		  
		 
		 employeeService.saveEmp(emp);
		 EmployeeDTO employeeDTO1 = employeeService.authenticate(emp.getemailID(), emp.getPassword());
		  
		return employeeDTO1;
		}

		@DeleteMapping("employees/{id}") //444/employees/8

		EmployeeDTO deleteEmp(@PathVariable int id){	
		  
			EmployeeDTO employeeDTO = employeeService.requestInfo(id);
			employeeService.deleteEmp(id);
			
		  
		  return employeeDTO;
		}	
		
		@PutMapping("employeeRestUpdate")
		
		EmployeeDTO updateEmp(@RequestBody EmployeeDTO emp) {
			employeeService.editEmp(emp);
			EmployeeDTO employeeDTO = employeeService.requestInfo(emp.getEmployeeID());
			
			return employeeDTO;
		}
			

}
