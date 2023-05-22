package com.in28minutes.rest.webservices.restfulwebservices.HelloWorld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController



public class HelloWorldController {
		
	@GetMapping(path = "/hello-world")	
	public String helloworld() {
	
	return "Hello World";
	
	}
	
	@GetMapping(path = "/hello-world")	
	public helloworldBean helloworldBean() {
	
	return new helloworldBean("Hello World");
	
	}	
	
}
