package com.rsc.payments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsc.payments.entity.model.Account;
import com.rsc.payments.entity.model.Customer;
import com.rsc.payments.service.CustomerMgrImpl;


@RestController
@RequestMapping("api")
public class CustomerController extends BaseController {

	@Autowired
	private CustomerMgrImpl customerService;
	
	@GetMapping(value = "/customers", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getCustomers() {
		System.out.println("=====data..." + customerService.getAllCustomers());
		return new ResponseEntity<List<Customer>>(customerService.getAllCustomers(),HttpStatus.OK);
	}
	
	@PostMapping(value = "/customer", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer cust) {
		customerService.createCustomer(cust);
		Customer custResult = customerService.fetcCustomerByCustomerID(cust.getId()); 
		return new ResponseEntity<Customer>(custResult,HttpStatus.OK);
	}
	
	@GetMapping(value = "/customer/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
		Customer cust = customerService.fetcCustomerByCustomerID(id);
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}
}
