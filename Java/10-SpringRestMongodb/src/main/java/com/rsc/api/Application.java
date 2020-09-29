package com.rsc.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rsc.api.model.Account;
import com.rsc.api.model.Customer;
import com.rsc.api.model.CustomerType;
import com.rsc.api.service.CustomerService;
import com.rsc.api.service.SequenceGeneratorService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerService service;
	
	@Autowired
	private SequenceGeneratorService seqService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Account> lstAccounts = new ArrayList<>();
		Account act1 = new Account();
		act1.setId(1);
		act1.setAccNbr("1234567");

		Account act2 = new Account();
		act2.setId(2);
		act2.setAccNbr("345678");

		Account act3 = new Account();
		act3.setId(3);
		act3.setAccNbr("987654");

		lstAccounts.add(act1);
		lstAccounts.add(act2);
		lstAccounts.add(act3);

		CustomerType custType = new CustomerType();
		custType.setId(1);
		custType.setDescription("Savings");

		Customer cust = new Customer();
		cust.setId(seqService.getNextSequence("database_sequences"));
		cust.setAccounts(lstAccounts);
		cust.setCustType(custType);
		cust.setFirstName("SuperStar");
		cust.setLastName("Rajinikanth");
		//service.saveCustomer(cust);
		
		
		for(int i=0;i<5;i++) {
			Customer cust1 = new Customer();
			cust1.setId(seqService.getNextSequence("database_sequences"));
			//cust.setAccounts(lstAccounts);
			//cust.setCustType(custType);
			cust1.setFirstName("SuperStar" + i);
			cust1.setLastName("Rajinikanth"  +1);
			cust1.setAccounts(lstAccounts);
			//service.saveCustomer(cust1);
		}
		
	
		   
		System.out.println("=============================Completed");	
	}

}
