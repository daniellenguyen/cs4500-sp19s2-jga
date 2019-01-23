package com.example.cs4500sp19s1jga.models;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;

	// ID

	public Integer getID() {
		return id;
	}

	public void setID(Integer id) {
		this.id = id;
	}

	// Username

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// Password

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// First Name

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Last Name

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
