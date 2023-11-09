package com.kyle.SpringBootDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kyle.SpringBootDemo.Services.AuthenticationService;

@Controller
public class LoginController {
	
	@Autowired
	private AuthenticationService authenticationService;
	
	//localhost:8080/login?name=kyle
	//default value is @RequestMapping(value="/login", method=RequestMethod.GET)
	@RequestMapping("/login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		//this will put the value of inputed request parameter name into the variable "name" that can be accessed in the 
		//template matching the name of the returned string
		model.put("name", name);
		//System.out.println("Request param is " + name); //NOT RECOMMENDED FOR PROD CODE
		return "login";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	//login?name=codewithheeren&password=123 
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if(authenticationService.authenticate(name, password)) {
			model.put("name", name);
			
			return "welcome";
		}
		return "login";
	}
}
