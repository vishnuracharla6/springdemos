package com.luv2code.springboot.thymeleafdemo.table.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String email;

	public Employee() {
		
	}

	public Employee(int id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


}



