package com.rsc.api.service;

import java.util.List;

import org.springframework.data.mongodb.core.query.TextCriteria;

import com.rsc.api.model.Customer;

public interface CustomerService {
	public void saveCustomer(Customer cust);

	public List<Customer> findByFirstName(String firstName);

	public List<Customer> findByLastName(String lastName);
	
	public List<Customer> findAllCustomers();
	
	public List<Customer> findAllBy(String criteria);
}
