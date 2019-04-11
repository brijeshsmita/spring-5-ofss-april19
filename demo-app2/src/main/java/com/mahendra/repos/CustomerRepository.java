package com.mahendra.repos;

import java.util.List;
import java.util.LinkedList;

import com.mahendra.model.Customer;

public class CustomerRepository {
	private List<Customer> customers;

	public CustomerRepository() {
		customers = new LinkedList<Customer>();
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
}
