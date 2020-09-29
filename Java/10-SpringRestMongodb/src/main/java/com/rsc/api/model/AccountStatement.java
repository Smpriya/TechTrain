package com.rsc.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;

@Document(collection = "acctstmt")
public class AccountStatement {
	
	@Id
	private int id;
	
	@DBRef
	private TxnReference txnRef;
	
	private Boolean isCredit;
	
	private short amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getIsCredit() {
		return isCredit;
	}

	public void setIsCredit(Boolean isCredit) {
		this.isCredit = isCredit;
	}

	public short getAmount() {
		return amount;
	}

	public void setAmount(short amount) {
		this.amount = amount;
	}

	public TxnReference getTxnRef() {
		return txnRef;
	}

	public void setTxnRef(TxnReference txnRef) {
		this.txnRef = txnRef;
	}

}
