package org.customer.service.api;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.customer.service.intercomm.AccountClient;
import org.customer.service.model.Account;
import org.customer.service.model.Customer;
import org.customer.service.model.CustomerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerApi {
	@Autowired
	private AccountClient accountClient;
	
	protected Logger logger = Logger.getLogger(CustomerApi.class.getName());
	
	private List<Customer> customers;
	
	public CustomerApi() {
		customers = new ArrayList<>();
		customers.add(new Customer(1, "12345", "Adam Kowalski", CustomerType.INDIVIDUAL));
		customers.add(new Customer(2, "12346", "Anna Malinowska", CustomerType.INDIVIDUAL));
		customers.add(new Customer(3, "12347", "Paweł Michalski", CustomerType.INDIVIDUAL));
		customers.add(new Customer(4, "12348", "Karolina Lewandowska", CustomerType.INDIVIDUAL));
	}
	
	@RequestMapping("/customers/pesel/{pesel}")
	public Customer findByPesel(@PathVariable("pesel") String pesel) {
		logger.info(String.format("Customer.findByPesel(%s)", pesel));
		return customers.stream().filter(it -> it.getPesel().equals(pesel)).findFirst().get();	
	}
	
	@RequestMapping("/customers")
	public List<Customer> findAll() {
		logger.info("Customer.findAll()");
		System.out.println("0=================================" + customers);
		return customers;
	}
	
	@RequestMapping("/customers/{id}")
	public Customer findById(@PathVariable("id") Integer id) {
		logger.info(String.format("Customer.findById(%s)", id));
		System.out.println("1=================================" + id);
		Customer customer = customers.stream().filter(it -> it.getId().intValue()==id.intValue()).findFirst().get();
		System.out.println("2=================================" + customer);
		List<Account> accounts =  accountClient.getAccounts(id);
		System.out.println("3=================================" + accounts);
		customer.setAccounts(accounts);
		return customer;
	}
}
