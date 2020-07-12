package com.rsc.payments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsc.payments.entity.model.Account;
import com.rsc.payments.entity.model.Customer;
import com.rsc.payments.repo.CustomerDAOImpl;

@Service
public class CustomerMgrImpl implements CustomerMgr {

	@Autowired
	private CustomerDAOImpl customerDao;
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}
	
	@Override
	public void createCustomer(Customer cust) {
		customerDao.createCustomer(cust);
	}

	@Override
	public List<Customer> fetcCustomerByCustomerID(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.fetcCustomerByCustomerID(customerId);
	}
	

}
