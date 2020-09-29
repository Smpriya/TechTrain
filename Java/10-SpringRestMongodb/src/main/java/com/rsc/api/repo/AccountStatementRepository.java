package com.rsc.api.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rsc.api.model.AccountStatement;
import com.rsc.api.model.Customer;
import com.rsc.api.model.TxnReference;

@Repository
public interface AccountStatementRepository extends MongoRepository<AccountStatement, String> {
	  public AccountStatement findByTxnRef(TxnReference txnRef);
}
