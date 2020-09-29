package com.rsc.payments.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsc.payments.entity.model.Account;
import com.rsc.payments.entity.model.Customer;
import com.rsc.payments.repo.AccountDAO;
import com.rsc.payments.repo.AccountDAOImpl;

@Service
@Transactional
public class AccountMgrImpl implements AccountMgr {
	
	@Autowired
	private AccountDAOImpl accountRepo;

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountRepo.getAllAccounts();
	}

	@Override
	public void createAccount(Account act) {
		// TODO Auto-generated method stub
		accountRepo.createAccount(act);
	}

	@Override
	public List<Account> fetcCustomerByAccountNumber(String accountNbr) {
		// TODO Auto-generated method stub
		if (accountNbr.equalsIgnoreCase("123456")) {
			accountNbr = "7654321";
		}
		
		System.out.println("==" + accountRepo.fetcAccountByAccountNumber(accountNbr));
		return accountRepo.fetcAccountByAccountNumber(accountNbr);
	}

}
