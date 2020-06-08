package com.joselcastillo.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // Added a "parent RequestMapping" to resolve conflict with same-name RequestMapping in SillyController class
public class HelloWorldController {
	
	// Need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// Need a controller method to process the HTML form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// Create a new controller method to read from data and add data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutAName(HttpServletRequest request, Model model) {
		
		// Read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// Convert the data to all upper case
		theName = theName.toUpperCase();
		
		// Create the message
		String result = "Yo! " + theName;
		
		// Add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	// 
	
	@RequestMapping("/processFormVersionThree")
	/* With the special annotation @RequestParam("studentName") , Behind the scenes, Spring will read the parameter from the 
	 * request : studentName, and then bind it to the variable: theName  so that it can be used throughout the application. */
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) { // this means " Assign theName
		 																							  // to the value of the request
																									  // parameter.
		// Read the request parameter from the HTML form 											  
		// String theName = request.getParameter("studentName"); // This code is now being handled by the above code changes
		
		// Convert the data to all upper case
		theName = theName.toUpperCase();
		
		// Create the message
		String result = "Hey friend from V3! " + theName;
		
		// Add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
