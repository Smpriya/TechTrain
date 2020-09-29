package com.rsc.api.service;

import java.util.List;

import com.rsc.api.model.AccountStatement;
import com.rsc.api.model.Customer;
import com.rsc.api.model.TxnReference;

public interface AccountStatementService {

	public void saveAccountStatement(AccountStatement as);

	public List<AccountStatement> findByAccount(String account);

	public AccountStatement findByTxnrefno(String txnrefno);

	public List<AccountStatement> findAllAccountStatement();
}
