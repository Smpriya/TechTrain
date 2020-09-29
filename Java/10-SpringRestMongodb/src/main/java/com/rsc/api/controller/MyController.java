package com.rsc.api.controller;

import java.util.List;

import javax.websocket.server.PathParam;

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

import com.rsc.api.model.AccountStatement;
import com.rsc.api.model.Customer;
import com.rsc.api.model.TxnReference;
import com.rsc.api.service.AccountStatementService;
import com.rsc.api.service.CustomerService;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	private CustomerService service;
	
	@Autowired
	private AccountStatementService actStmtService;

	@PostMapping(value = "/customer", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> createCustomer(@RequestBody Customer cust) {
		System.out.println("cust=" + cust);
		service.saveCustomer(cust);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
	@GetMapping(value="/customer/{name}")
	public ResponseEntity<List<Customer>> getCustomerByName(@PathVariable String name){
		return new ResponseEntity<List<Customer>>(service.findByFirstName(name),HttpStatus.OK);
	}
	
	@GetMapping(value="/custsearch/{name}")
	public ResponseEntity<List<Customer>> getCustomerByTxt(@PathVariable String name){
		return new ResponseEntity<List<Customer>>(service.findAllBy(name),HttpStatus.OK);
	}
	
	@GetMapping(value="/customers")
	public ResponseEntity<List<Customer>> getCustomers(){
		return new ResponseEntity<List<Customer>>(service.findAllCustomers(),HttpStatus.OK);
	}
	
	@PostMapping(value = "/accountstmt", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> createAccountStatement(@RequestBody AccountStatement astmt) {
		System.out.println("AccountStatement=" + astmt);
		actStmtService.saveAccountStatement(astmt);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
	@GetMapping(value = "/accountstmt/{txnref}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccountStatement> getAccountStatementByTxnRef(@PathVariable String txnref) {
		AccountStatement lst = actStmtService.findByTxnrefno(txnref);
		return new ResponseEntity<AccountStatement>(lst,HttpStatus.OK);
	}
	
	@GetMapping(value = "/accountstmts", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AccountStatement>> getAllAccountStatements() {
		List<AccountStatement> lst = actStmtService.findAllAccountStatement();
		return new ResponseEntity<List<AccountStatement>>(lst,HttpStatus.OK);
	}
	
}
