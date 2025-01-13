package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/sayHello")
	public String sayHello() {
		return "<html><body><h2 align='center' style='background-color:pink'>Hello, Have a Nice Day !!!</h2></body></html>";
	}
}
