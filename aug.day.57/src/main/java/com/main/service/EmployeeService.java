package com.main.service;

import java.util.List;
import java.util.Optional;

import com.main.dto.EmployeeDTO;
import com.main.entity.EmployeeEntity;

public interface EmployeeService {
	
	List<EmployeeDTO> FetchAllEmployees();
	
	void saveEmp(EmployeeDTO empDTO);
	
	EmployeeDTO authenticate(String email, String pswd);
	
	void deleteEmp(int employeeID);
	
	EmployeeDTO requestInfo(int employeeID);
	
	void editEmp(EmployeeDTO empDTO);

}
