package com.mahendra.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahendra.model.Customer;
import com.mahendra.repos.CustomerRepository;
import com.mahendra.services.CustomerService;

public class Main {

	public static void main(String[] args) {
		// Uses BeanFactory to create all Instances/Objects
		// All the "beans" are "SINGLETONs"
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = context.getBean(CustomerService.class);
		CustomerRepository repo = context.getBean(CustomerRepository.class);
		CustomerRepository repo1 = context.getBean(CustomerRepository.class);
		System.out.println("List of Customers");
		service.printAll();
		
		System.out.println(service.getRepository() == repo);
		System.out.println(service.getRepository() == repo1);
		
		System.out.println(service.getRepository()+" "+repo+" "+repo1);
		
		
	}
	

}
