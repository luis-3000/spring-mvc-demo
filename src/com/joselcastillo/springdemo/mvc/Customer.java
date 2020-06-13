package com.joselcastillo.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.joselcastillo.springdemo.mvc.validation.CourseCode;

public class Customer {

	private String firstName;
	
	// Adding the validation rules for the lastName
	@NotNull(message="last name is required")
	@Size(min=1, message="last name is required")
	private String lastName;
	
	// Adding validation rules
	@NotNull(message="this number is required")
	@Min(value=0, message="value must be greater than or equal to zero")
	@Max(value=10, message="value must be less than or equal to 10")
	private Integer freePasses;
	
	// Adding validation rules
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	// Custom annotation
	//@CourseCode(value="TOPS", message="must start with TOPS") // Handles single prefix value
	@CourseCode(value={"TOPS", "LUV"}, message="must start with TOPS or LUV") // Handles multiple prefix values
	private String courseCode;
	
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
}
