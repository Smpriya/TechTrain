package com.rsc.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsc.api.model.Customer;
import com.rsc.api.repo.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl extends BaseService  implements CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	@Override
	public void saveCustomer(Customer cust) {
		cust.setId(getSeqService().getNextSequence("database_sequences"));
		repo.save(cust);
	}

	@Override
	public List<Customer> findByFirstName(String firstName) {
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

	@Override
	public List<Customer> findAllBy(String criteria) {
		// TODO Auto-generated method stub
		TextCriteria search = TextCriteria.forDefaultLanguage().matching(criteria);
		List<Customer> r = repo.findAllBy(search);
		r.stream().forEach(u -> System.out.println(u.accounts + "=" + u.getTextScore()));
		
		return r;
	}
	
	

}
