package com.dao;

public interface EmployeeDao {

	EmployeeEntity authenticate(String emailId,String password);
}
