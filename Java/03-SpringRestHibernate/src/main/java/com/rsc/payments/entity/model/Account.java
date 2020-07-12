package com.rsc.payments.entity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_account")
public class Account extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "acctnbr")
	private String accountNumber;

	private String acctType;

	@Column(name = "ldgrbal")
	private long ledgerBalance;

	private String bankCode;

	private String branchCode;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Customer cust;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public long getLedgerBalance() {
		return ledgerBalance;
	}

	public void setLedgerBalance(long ledgerBalance) {
		this.ledgerBalance = ledgerBalance;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	
}
