package com.rsc.payments.entity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_accountdetails")
public class AccountDetail extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String branchcode;
	
	private long ledgerBalance;
	
	private long availableBalance;
	
	private boolean isLocked;
	
	private String accountOvrideInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public long getLedgerBalance() {
		return ledgerBalance;
	}

	public void setLedgerBalance(long ledgerBalance) {
		this.ledgerBalance = ledgerBalance;
	}

	public long getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(long availableBalance) {
		this.availableBalance = availableBalance;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public String getAccountOvrideInfo() {
		return accountOvrideInfo;
	}

	public void setAccountOvrideInfo(String accountOvrideInfo) {
		this.accountOvrideInfo = accountOvrideInfo;
	}
	
}
