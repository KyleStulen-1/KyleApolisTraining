package com.kyle.SpringBootDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHell() {
		return "HTTP request recieved from client at /hello";
	}
	
	@RequestMapping("/firsthtml")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page head</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	@RequestMapping("/sayhellotemplate")
	//no @ResponseBody tells it to go fetch a template matching the name of the return String 
	public String sayHelloTemplate() {
		return "sayhello";
	}
	
}
