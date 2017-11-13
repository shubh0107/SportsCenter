package com.project.model;

public class Account {
	
	private String name;
	private String email;
	private String gender;
	private String password;
	private String dob;
	
	
	public Account()
	{
		
	}
	
	public Account(String name, String email, String gender, String password, String dob) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.password = password;
		this.dob = dob;
	}
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void setGender(String ch) {
		this.gender = ch;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
