package com.service;

import java.util.List;

public interface EmployeeService {
	
	EmployeeDTO authenticate(String emailId,String password);
	
	List<EmployeeDTO> giveAllEmp();
	
	void deleteEmp(int employeeID);
	
	void saveEmp(EmployeeDTO empDTO);
	
	void editEmp(EmployeeDTO empDTO);
	
	EmployeeDTO requestInfo(int employeeID);

}
