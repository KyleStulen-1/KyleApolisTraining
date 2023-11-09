package com.kyle.SpringBootDemo.MyWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//component scan tells spring where to search for annotated classes 
@ComponentScan("com.kyle")
/*
 * @SpringBootApplication utilizes the default implmentations of 
 * @Configuration -> denotes current file as a configuration file 
 * @EnableAutoConfiguration -> creates beans based on pom.xml 
 * @ComponentScan -> tells it to scan current package with no arguments, can pass a string array for multiple packages
 */
public class SpringBootDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
}
