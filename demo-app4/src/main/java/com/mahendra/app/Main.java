package com.mahendra.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahendra.model.Customer;
import com.mahendra.repos.CustomerRepository;
import com.mahendra.services.CustomerService;

public class Main {

	public static void main(String[] args) {
		// Uses BeanFactory to create all Instances/Objects
		// All the "beans" are "SINGLETONs"
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//Request for Bean of Type CustomerService
		//Got CustomerService bean
		CustomerService service = context.getBean(CustomerService.class);
		System.out.println("Service Instance classname: "+service.getClass().getName());
		
		//Request for Bean of Type CustomerRepository
		//Got a PROXY genereted by AspectJ!!
		CustomerRepository repo = context.getBean(CustomerRepository.class);
		System.out.println("Repositort instance classname: "+repo.getClass().getName());
		
		List<Customer> customers = service.getRepository().getCustomers();
		
		context.close();
	}
	

}
