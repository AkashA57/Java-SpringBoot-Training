package com.dao;

public class EmployeeEntity {
	
	private int employeeID;
	private String name;
	private int salary;
	private String email;
	private String password;
	
	
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public EmployeeEntity(int employeeID, String name, int salary, String email, String password) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.password = password;
	}


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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + ", email=" + email
				+ ", password=" + password + "]";
	}
	

}
