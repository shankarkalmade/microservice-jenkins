package com.spring.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.models.Customer;
import com.spring.service.services.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/customer/register", method=RequestMethod.POST) 
	Customer register(@RequestBody Customer customer) {
		return customerService.register(customer);
	}
	
	
	
}
