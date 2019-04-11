package com.mahendra.app;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.mahendra.model.Customer;
import com.mahendra.repos.CustomerRepository;

// Introduced in Spring 3.2
// This is replacement of SPRING.XML file
@Configuration 
//Enable Annotations and Autowiring
@ComponentScan("com.mahendra")
public class AppConfig {
	
	@Bean
	public Customer cust1() {
		return new Customer("Dharmendra","Panvel","687987987");
	}
	
	@Bean
	public Customer cust2() {
		return new Customer("Jeetendra","Bandra","875777987");
	}

	@Bean
	//@Scope("prototype") // Create Multiple instances (On Demand bean creation)
	// On Demand:	1. Every time this bean need to be INJECTED somewhere
	//				2. Every time "context.getBean" method is called with This class
	public CustomerRepository repo() {
		CustomerRepository repo = new CustomerRepository();
		List<Customer> customers = new LinkedList<Customer>();
		repo.setCustomers(customers);
		//Dependency Inject
		customers.add(cust1());
		customers.add(cust2());
		return repo;
	}
}
