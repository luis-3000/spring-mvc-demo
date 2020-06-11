package com.joselcastillo.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	
	// Adding the validation rules for the lastName
	@NotNull(message="last name is required")
	@Size(min=1, message="last name is required")
	private String lastName;
	
	@Min(value=0, message="value must be greater than or equal to zero")
	@Max(value=10, message="value must be less than or equal to 10")
	private int freePasses;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	
	
	
}
