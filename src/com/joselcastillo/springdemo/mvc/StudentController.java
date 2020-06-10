package com.joselcastillo.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) { //The Model is used to pass data between Controllers and Views
		
		// Create a new student object
		Student theStudent = new Student();
		
		// add student object to the model as an attribute
		theModel.addAttribute("student", theStudent); // "student" is the Attribute name, theStudent is the corresponding object Value
		
		return "student-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) { //@ModelAttribute binds form data to the 'student' object
		
		// Log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		
		return "student-confirmation";
	}
	

}
