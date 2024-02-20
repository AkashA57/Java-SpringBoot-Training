package com.dao;

import java.util.List;

import com.service.EmployeeDTO;

public interface EmployeeDao {

	EmployeeEntity authenticate(String emailId,String password);
	
	List<EmployeeEntity> giveAllEmp();
	
	void deleteEmp(int employeeID);
	
	void saveEmp(EmployeeEntity employeeEntity);
	
	void editEmp(EmployeeEntity employeeEntity);
	
	EmployeeEntity requestInfo(int employeeID);
}
