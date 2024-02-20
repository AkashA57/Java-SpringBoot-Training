package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Charger;
import com.service.Employee;
import com.service.Laptop;


public class LaptopChargerSpringMain2 {

	public static void main(String[] args) {
		
		//following line creates spring container	
		ApplicationContext 	applicationContext=new ClassPathXmlApplicationContext("employee-service.xml");
		
		//hey container..give me car bean
		
		Laptop laptop=(Laptop) applicationContext.getBean("laptop");
		
		System.out.println(laptop);
		
		//lets access charger separately
		
		Charger charger=(Charger) applicationContext.getBean("charger");
		System.out.println(charger);
		
	}

}
