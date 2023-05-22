package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class userresource {
	private  userDaoservice service;
	public userresource(userDaoservice service) {
		this.service=service;
		
		
	}	
	
 //GET /users
	@GetMapping("/users")
	public List<user> retrieveAllUsers(){
		return service.findAll();	
	}
	
	
	
	
}
