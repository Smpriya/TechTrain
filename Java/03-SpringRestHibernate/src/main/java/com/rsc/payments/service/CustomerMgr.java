package com.rsc.payments.service;

import java.util.List;

import com.rsc.payments.entity.model.Account;
import com.rsc.payments.entity.model.Customer;

public interface CustomerMgr {
	public List<Customer> getAllCustomers();
	public void createCustomer(Customer cust);
	public Customer fetcCustomerByCustomerID(int customerId);
}
