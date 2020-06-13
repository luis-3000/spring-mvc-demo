package com.joselcastillo.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/* The '@interface' plus the Class_Name allows for a custom annotation. 
 * ( @interface is a special annotation, a special "type of interface". ) 
 * CourseCodeConstraintValidator is a helper class that contains business logic / validation logic */
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME) // How long will the mark annotation be stored or used
public @interface CourseCode {

	// Define the attributes that we can pass into our annotation
	// 1. Define default course code
	public String value() default "LUV";
	
	// 2. Define default error message
	public String message() default "must start with LUV";
	
	
	// 3. Define default groups
	public Class<?>[] groups() default {};
	
	// 4. Define default payloads
	public Class<? extends Payload>[] payload() default {};
	
}
