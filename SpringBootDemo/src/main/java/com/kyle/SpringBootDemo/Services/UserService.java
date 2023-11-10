package com.kyle.SpringBootDemo.Services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.kyle.SpringBootDemo.entity.User;

@Service
public class UserService {
	//for now this map is simulating database access
	//will never work for production because information is wiped on server restart 
	private static Map<String, User> users = new HashMap<>();

	public void addUser(User user) {
		users.put(user.getUsername(), user);
	}
	
	public User getUser(String username) {
		return users.get(username);
	}

	public boolean authenticate(String username, String password) {
		User existingUser = users.get(username);
		if (existingUser != null) {
			
			if (password.equals(existingUser.getPassword()))
				return true;
		}
		return false;
	}
}