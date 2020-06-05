package com.joselcastillo.springdemo.mvc;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // This tells Spring that this is a Controller component and to make use of it
public class HomeController {
	
	// Define a Controller method
	@RequestMapping("/") // Add the Request Mapping to the Controller method
	public String showPage() {
		return "main-menu"; // Return the View Name. Spring searches for the path/parts that will make up the 
							// complete path, put them together and return them (Prefix + view name + suffix). 
							// In this case it will return /WEB-INF/view + /main-menu + .jsp
							// /WEB-INF/view/main-menu.jsp
	}

}
