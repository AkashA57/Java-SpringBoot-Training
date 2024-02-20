package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CarFactoryService;

public class CarMainSpring {

	public static void main(String[] args) {
		
		//creating Container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("car-service.xml");
		
		//ask spring container to give a car bean
		//CarFactoryService carFactory = (CarFactoryService)applicationContext.getBean("carFactory");
		
		CarFactoryService carFactory = (CarFactoryService)applicationContext.getBean("carFactoryService");

		System.out.println(carFactory);
		
		////CarFactoryService carFactory = (CarFactoryService)applicationContext.getBean("car2");
	}

}
