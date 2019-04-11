package com.mahendra.app;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mahendra.model.Customer;
import com.mahendra.repos.CustomerRepository;


// This is replacement of SPRING.XML file
@Configuration 
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
