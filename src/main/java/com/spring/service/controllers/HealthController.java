package com.spring.service.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		
		return "Hi World";
	}
	
	@RequestMapping(value = "/hello/{user}")
	public String sayHelloUser(@PathVariable("user") String user) {
		return "Hi "+  user;
		
	}
	
	@RequestMapping("/status")
	public String health() {
		return "I am Alive";
	}
	
}
