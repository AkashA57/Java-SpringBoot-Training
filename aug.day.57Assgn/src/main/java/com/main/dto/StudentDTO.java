package com.main.dto;

public class StudentDTO {
	
	private int ssn;
	private String name;
	private String emailID;
	private int age;
	
	
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentDTO(int ssn, String name, String emailID, int age) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.emailID = emailID;
		this.age = age;
	}


	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "StudentDTO [ssn=" + ssn + ", name=" + name + ", emailID=" + emailID + ", age=" + age + "]";
	}
	
	
}