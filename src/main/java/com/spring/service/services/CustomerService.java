package com.spring.service.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.spring.service.models.Customer;
import com.spring.service.repos.CustomerRepository;

@Component
@Lazy
public class CustomerService {

	CustomerRepository customerRepository;
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	
	}
	
	public Customer register(Customer customer) {
		
		Optional<Customer> existingCustomer = customerRepository.findByName(customer.getName());
		if(existingCustomer.isPresent()) {
			throw new RuntimeException("Customer is already present");
		} else {
			customerRepository.save(customer);
		}
		return customer;
	}
	
	
	
}
