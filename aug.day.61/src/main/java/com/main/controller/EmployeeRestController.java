package com.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.dto.AppResponse;
import com.main.dto.EmployeeDTO;

@RestController
public class EmployeeRestController {
	

		@GetMapping("showEmployee")
		EmployeeDTO showEmp(){
			
			EmployeeDTO  employeeDTO=new EmployeeDTO("sahas",899,"s@gmail.com","pass4");
			
			return employeeDTO;			
			
		}
		
		@GetMapping("employees")
		
		List<EmployeeDTO> showAll(){	
			
		  List<EmployeeDTO> employeeDTOList=new ArrayList<>();
		  
		  EmployeeDTO employeeDTO1=new EmployeeDTO("prabhat",300,"p@gmail.com","pass");
		  EmployeeDTO employeeDTO2=new EmployeeDTO("manisha",400,"m@gmail.com","pass2");
		  EmployeeDTO employeeDTO3=new EmployeeDTO("mohan",500,"m@gmail.com","pass3");
		  
		  employeeDTOList.add(employeeDTO1);
		  employeeDTOList.add(employeeDTO2);
		 employeeDTOList.add(employeeDTO3);  	  
		  
		return employeeDTOList;	
		
		}
		
		@GetMapping("employees/{id}") //444/employees/8

		EmployeeDTO showEmp(@PathVariable int id){	
		  
		  EmployeeDTO employeeDTO1=new EmployeeDTO("prabhat",300,"p@gmail.com","pass"); 
		  employeeDTO1.setEmployeeID(id);
		  
		  return employeeDTO1;
		}


		@PostMapping("employees")

		EmployeeDTO insertEmp(@RequestBody EmployeeDTO emp){	
		  
		 emp.setemailID("sujal@gmail.com");
		  
		return emp;
		}

		@DeleteMapping("employees/{id}") //444/employees/8

		AppResponse deleteEmp(@PathVariable int id){	
		  
		  //delete id from db
		  //send some response to client(postman)
			AppResponse ar=new AppResponse();
			ar.setMessage("ur data is deleted");
			ar.setStatus(200);
			
		  
		  return ar;
		}	
			

}
