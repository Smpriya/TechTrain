package com.rsc.payments.service;

import java.util.List;

import com.rsc.payments.entity.model.Account;
import com.rsc.payments.entity.model.Customer;

public interface AccountMgr {
	public List<Account> getAllAccounts();
	public void createAccount(Account act);
	public List<Account> fetcCustomerByAccountNumber(String accountNbr);
}
