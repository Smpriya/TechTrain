package com.rsc.api.repo;

import java.util.List;

import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rsc.api.model.AccountStatement;
import com.rsc.api.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
	  public List<Customer> findByFirstName(String firstName);
	  public List<Customer> findByLastName(String lastName);
	  public List<Customer> findAllBy(TextCriteria criteria);

}
