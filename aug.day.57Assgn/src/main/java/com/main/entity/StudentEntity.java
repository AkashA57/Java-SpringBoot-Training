package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
	
	private int ssn;
	private String name;
	private String emailID;
	private int age;
	
	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentEntity(int ssn, String name, String emailID, int age) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.emailID = emailID;
		this.age = age;
	}

	@Id
	@GeneratedValue
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
		return "StudentEntity [ssn=" + ssn + ", name=" + name + ", emailID=" + emailID + ", age=" + age + "]";
	}
	

}
