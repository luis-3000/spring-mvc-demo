package com.joselcastillo.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
	@RequestMapping("/showForm") // Same request mapping as HelloWorldController class
	public String displayTheForm() {
		return "silly"; // No "silly" template yet, but method will fail due to conflict on same-name RequestMapping
	}
	

}
