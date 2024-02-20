package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeEntity {
	
	private int employeeID;
	private String name;
	private int salary;
	private String emailID;
	private String password;
	
	
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public EmployeeEntity(String name, int salary, String emailID, String password) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.emailID = emailID;
		this.password = password;
	}

	@Id
	@GeneratedValue
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + ", emailIDS=" + emailID
				+ ", password=" + password + "]";
	}
	

}
