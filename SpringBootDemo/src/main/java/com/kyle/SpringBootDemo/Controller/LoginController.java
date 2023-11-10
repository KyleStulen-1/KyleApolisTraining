package com.kyle.SpringBootDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kyle.SpringBootDemo.Services.UserService;
import com.kyle.SpringBootDemo.entity.User;

import jakarta.validation.Valid;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	//localhost:8080/login?name=kyle
	//default value is @RequestMapping(value="/login", method=RequestMethod.GET)
	@RequestMapping("/login")
	public String gotoLoginPage(ModelMap model) {
		//this will put the value of inputed request parameter name into the variable "name" that can be accessed in the 
		//template matching the name of the returned string
		//model.put("name", name);
		//System.out.println("Request param is " + name); //NOT RECOMMENDED FOR PROD CODE
		return "login";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {
		
		if(userService.authenticate(username, password)) {
			model.put("user", userService.getUser(username));
			
			return "profile";
		}
		model.put("errorMessage", "Invalid Credentials! Please try again.");
		return "login";
	}
	
	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public String gotoSignUpPage(ModelMap model) {
		model.put("user", new User());
		return "signup";
	}
	
	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public String userProfile(@Valid @ModelAttribute("user") User user,BindingResult result ,ModelMap model) {
		model.put("user", user);
		
		if (result.hasErrors()) {
			//by putting the user back into the model, information stays in fields if
			//invalid information is provided to the signup form
			return "signup";
		}
		
		userService.addUser(user);
		
		return "profile";
	}
}











