package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;


public class user {
	
	
	private Integer id;
	private String Name;
	private LocalDate birthdate;
	public user(Integer id, String name, LocalDate birthdate) {
		super();
		this.id = id;
		Name = name;
		this.birthdate = birthdate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", Name=" + Name + ", birthdate=" + birthdate + "]";
	
	}
	
}

