package com.mahendra.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahendra.model.Customer;
import com.mahendra.repos.CustomerRepository;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		CustomerRepository repo = context.getBean(CustomerRepository.class);
		
		System.out.println("List of Customers");
		
		repo.getCustomers().forEach(Main::printNames);
		
	}
	
	private static void printNames(Customer customer) {
		System.out.println(customer.getName());
	}

}
