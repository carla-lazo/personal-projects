package com.springboot.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingPageController {
	
	@GetMapping("/home")
	public String welcome() {
		return "Hello! Welcome to My Page";
	}

}
