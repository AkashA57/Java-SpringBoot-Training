package com.main.dto;

public class EmployeeDTO {
	
	private int employeeID;
	private String name;
	private int salary;
	private String emailID;
	private String password;
	
	
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public EmployeeDTO(String name, int salary, String emailID, String password) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.emailID = emailID;
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
	public String getemailID() {
		return emailID;
	}
	public void setemailID(String emailID) {
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
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + ", emailID=" + emailID
				+ ", password=" + password + "]";
	}
	

}
