package com.rsc.api.service;

import java.util.List;

import com.rsc.api.model.Customer;

public interface CustomerService {
	public void saveCustomer(Customer cust);

	public Customer findByFirstName(String firstName);

	public List<Customer> findByLastName(String lastName);
	
	public List<Customer> findAllCustomers();
}
