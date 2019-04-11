package com.mahendra.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mahendra.repos.CustomerRepository;

@Component // Alternative to either <bean> or @Bean
public class CustomerService {
	
	@Autowired // Autowiring (Implicit DI)
	// ByName :	Search for bean with ID/NAME "repository"
	// ByType : Search for bean with classname "CustomerRepository"
	// constructor: Search for bean with classname matching with
	//				constructor arguments
	private CustomerRepository repository;

	public void setRepository(CustomerRepository repository) {
		this.repository = repository;
	}
	
	public void printAll() {
		System.out.println("Displaying all customer details: ");
		repository.getCustomers().forEach((c)->{
			System.out.println(c.getName()+" "+c.getPhone());
		});
	}

	public CustomerRepository getRepository() {
		return repository;
	}
}
