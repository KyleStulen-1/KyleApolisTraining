package com.kyle.SpringBootDemo.Services;

import org.springframework.stereotype.Service;

//@Service denotes business logic
@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		System.out.println(username + password);
		boolean isValidUserName = username.equalsIgnoreCase("kyle");
		boolean isValidPassword = password.equalsIgnoreCase("123");		
		return isValidUserName && isValidPassword;
	}
}