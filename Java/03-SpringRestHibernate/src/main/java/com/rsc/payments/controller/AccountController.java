package com.rsc.payments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsc.payments.entity.model.Account;
import com.rsc.payments.entity.model.Customer;
import com.rsc.payments.service.AccountMgr;


@RestController
@RequestMapping("api")
public class AccountController extends BaseController {
	
	@Autowired
	private AccountMgr accountMgrImpl;
	
	@GetMapping(value = "/accounts", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Account>> getAccounts() {
		System.out.println("=====data..." + accountMgrImpl.getAllAccounts());
		return new ResponseEntity<List<Account>>(accountMgrImpl.getAllAccounts(),HttpStatus.OK);
	}
	
	@PostMapping(value = "/account", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> createAccount(@RequestBody Account act) {
		accountMgrImpl.createAccount(act);
		System.out.println("====&&==" + accountMgrImpl.fetcCustomerByAccountNumber(act.getAccountNumber()));
		List<Account> actResult = accountMgrImpl.fetcCustomerByAccountNumber(act.getAccountNumber());
		return new ResponseEntity<Object>(actResult,HttpStatus.OK);
	}
}
