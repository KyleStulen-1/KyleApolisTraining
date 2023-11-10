package com.kyle.SpringBootDemo.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {
	
	@Email(message="Username must be valid email.")
	@NotEmpty(message="Username can not be empty")
	private String username;
	
	@Size(min=8, message="Password must be minimum 8 characters")
	@Size(max=15, message="Password must not be more then 15 characters")
	private String password;
	
	@NotEmpty(message="Firstname must not empty")
	@NotBlank(message="Firstname must have at least one character")
	@Pattern(regexp="^(?=.{1,40}$)[a-zA-Z]+(?:[-'\\s][a-zA-Z]+)*$",message="Firstname must not contain any number")
	private String firstname;
	
	@NotEmpty(message="Lastname must not empty")
	@NotBlank(message="Lastname must have at least one character")
	@Pattern(regexp="^(?=.{1,40}$)[a-zA-Z]+(?:[-'\\s][a-zA-Z]+)*$",message="Firstname must not contain any number")
	private String lastname;
	
	@Min(message="Age must be minimum 18 yrs", value = 18)
	@Max(message="Age must not be more then 130 yrs", value = 130)
	private int age;

	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User() {
		super();
	}

	public User(String username, String password, String firstname, String lastname) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", age=" + age + "]";
	}

}