package com.example.greet.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/greet")
	public String greet()
	{
		return "Hello, this is my first project learning GitHub Actions- REST API - Azure";
		
	}

}
