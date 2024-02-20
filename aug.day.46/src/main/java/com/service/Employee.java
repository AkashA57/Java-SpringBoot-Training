package com.service;

import org.springframework.stereotype.Service;

@Service
public class Employee {
	
	private String name = "Akash";
	private int age = 30;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	

}
