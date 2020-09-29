package com.rsc.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account")
public class Account {
	
	@Id
	private int id;
	
	private String accNbr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccNbr() {
		return accNbr;
	}

	public void setAccNbr(String accNbr) {
		this.accNbr = accNbr;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accNbr=" + accNbr + "]";
	}
	
	

}
