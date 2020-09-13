package com.rsc.api.controller;

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

import com.rsc.api.model.Customer;
import com.rsc.api.service.CustomerService;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	private CustomerService service;

	@PostMapping(value = "/customers", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> createCustomer(@RequestBody Customer cust) {
		service.saveCustomer(cust);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
	@GetMapping(value="/customer/{name}")
	public ResponseEntity<Customer> getCustomerByName(@PathVariable String name){
		return new ResponseEntity<Customer>(service.findByFirstName(name),HttpStatus.OK);
	}
	
	@GetMapping(value="/customers")
	public ResponseEntity<List<Customer>> getCustomers(){
		return new ResponseEntity<List<Customer>>(service.findAllCustomers(),HttpStatus.OK);
	}
	
}
