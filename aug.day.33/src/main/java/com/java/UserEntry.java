package com.java;

public class UserEntry {
	

	private String username1;
	private String password;
	private String fullname;
	private String email;
	private String gender;
	
	public UserEntry() {
		super();
		
	}

	public UserEntry(String username, String password, String fullname, String email, String gender) {
		super();
		this.username1 = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.gender = gender;
	}

	public String getUsername() {
		return username1;
	}

	public void setUsername(String username) {
		this.username1 = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

	}