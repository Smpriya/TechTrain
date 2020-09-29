package com.rsc.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.TextScore;

@Document(collection = "customer")
public class Customer {
	
	@Transient
    public static final String SEQUENCE_NAME = "cust_sequence";
	
	@Id
	public int id;

	@TextIndexed
	public String firstName;
	
	@TextIndexed
	public String lastName;
	
	@TextScore
	private Float textScore;
	
	public Float getTextScore() {
		return textScore;
	}

	public void setTextScore(Float textScore) {
		this.textScore = textScore;
	}

	public List<Account> accounts;
	
	public CustomerType custType;

	public Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", accounts=" + accounts
				+ ", custType=" + custType + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public CustomerType getCustType() {
		return custType;
	}

	public void setCustType(CustomerType custType) {
		this.custType = custType;
	}
	
	
}
