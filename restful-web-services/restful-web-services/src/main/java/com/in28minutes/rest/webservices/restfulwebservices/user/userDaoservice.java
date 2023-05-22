package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class userDaoservice {
  //   JPA/Hibernate>Database
  //	 userDaoservice>StaticList
	private static List<user> users = new ArrayList<>();
	
	static {
		
		users.add(new user(1,"adam",LocalDate.now().minusYears(30)));
		users.add(new user(2,"pranee",LocalDate.now().minusYears(29)));
		users.add(new user(3,"even",LocalDate.now().minusYears(26)));		
	}
	public List<user> findAll(){
		return users;
		
	}
	
	
	
	//public list<user> findAll(){
	//public user save(user user){
	//public user FindOne(int id){
	
	
	
	
}
