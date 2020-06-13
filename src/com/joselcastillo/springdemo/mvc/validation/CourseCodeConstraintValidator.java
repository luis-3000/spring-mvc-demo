package com.joselcastillo.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	// private String coursePrefix; // Single pre-fix value
	private String[] coursePrefixes; // multiple pre-fix values
	
	// Handles single prefix value
//	@Override
//	public void initialize(CourseCode theCourseCode) {
//		coursePrefix = theCourseCode.value();
//	}
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefixes = theCourseCode.value();
	}

	// Business rule/logic
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result = false;

		// Code for a single pre-fix value		
//		if(theCode != null) {
//			result = theCode.startsWith(coursePrefix);
//		} else {
//			result = true;
//		}
		
		// Code for multiple pre-fix values
		if(theCode != null) {
			// Loop throug course prefixes, check if the code matches any of the course prefixes
			for(String tempPrefix : coursePrefixes) {
				result = theCode.startsWith(tempPrefix);
				
				// If we found a match, then break out of the loop
				if(result) {
					break;
				}
			}
		} else {
			result = true;
		}
		
		return result;
	}
	
}
