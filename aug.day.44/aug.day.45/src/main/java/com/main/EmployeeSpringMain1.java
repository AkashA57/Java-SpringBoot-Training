package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Employee;


public class EmployeeSpringMain1 {

	public static void main(String[] args) {
		
		//following line creates spring container	
		ApplicationContext 	applicationContext=new ClassPathXmlApplicationContext("employee-service.xml");
		
		//hey container..give me car bean
		
		Employee employee=(Employee) applicationContext.getBean("emp1");
		
		System.out.println(employee);
		
		
	}

}
