package com.rsc.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsc.api.model.AccountStatement;
import com.rsc.api.model.TxnReference;
import com.rsc.api.repo.AccountStatementRepository;
import com.rsc.api.repo.TxnReferenceRepository;

@Service
@Transactional
public class AccountStatementServiceImpl extends BaseService implements AccountStatementService {
	
	@Autowired
	private AccountStatementRepository repo;
	
	@Autowired
	private TxnReferenceRepository txnRepo;

	@Override
	public void saveAccountStatement(AccountStatement as) {
		// TODO Auto-generated method stub
		
		TxnReference txnRef = new TxnReference();
		txnRef.setId(getSeqService().getNextSequence("database_sequences"));
		txnRef.setDesc(as.getTxnRef().getDesc());
		
		txnRepo.save(txnRef);
		
		
		
		as.setId(getSeqService().getNextSequence("database_sequences"));
		as.setTxnRef(txnRef);
		repo.save(as);
	}

	@Override
	public List<AccountStatement> findByAccount(String account) {
		// TODO Auto-generated method stub
		return null; //repo.findByAccount(account);
	}

	@Override
	public AccountStatement findByTxnrefno(String txnrefno) {
		// TODO Auto-generated method stub
		TxnReference txnref = new TxnReference();
		txnref.setDesc(txnrefno);
		
		return repo.findByTxnRef(txnref);
	}

	@Override
	public List<AccountStatement> findAllAccountStatement() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
