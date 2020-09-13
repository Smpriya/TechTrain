package com.rsc.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsc.api.model.Customer;
import com.rsc.api.repo.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	@Override
	public void saveCustomer(Customer cust) {
		repo.save(cust);
	}

	@Override
	public Customer findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return repo.findByFirstName(firstName);
	}

	@Override
	public List<Customer> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return repo.findByLastName(lastName);
	}
	
	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	

}
