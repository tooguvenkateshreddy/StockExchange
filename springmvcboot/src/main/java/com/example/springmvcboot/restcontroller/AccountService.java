package com.example.springmvcboot.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmvcboot.model.Account;

@RestController
@RequestMapping("/accounts")
public class AccountService {

	
//get --http://localhost:8471/accounts	---> list of account	
// get --	-http://localhost:8471/accounts/1001
	//post --http://localhost:8471/accounts	payload	
	// content json /xml
	// response
	// exceptin swagger
	// spring security
	// springdata hibernate
	
	// 2-3 weeks docker aws jenkins
	// 2 weeks
	// 6 weeks
	
	
	@GetMapping
	public ResponseEntity<List<Account>> getAccounts(){
		Account account =new Account();
		account.setAccountNo(1001);
		account.setBalance(34535.45f);
		account.setAccountType("saving");
		List<Account> accounts=new ArrayList<Account>();
		accounts.add(account);
		return new ResponseEntity<List<Account>>(accounts,HttpStatus.OK);

	}
	
	@GetMapping(value="/{accountn}", produces={MediaType.TEXT_PLAIN_VALUE})
	public Account getAccountById(@PathVariable("accountn")int accountNo){
		HttpHeaders headers = new HttpHeaders();
		headers.add("headerkey12", "headerValue12");
		System.out.println(accountNo);
		Account account =new Account();
		account.setAccountNo(accountNo);
		account.setBalance(34535.45f);
		account.setAccountType("saving");
		return account;
	}
	
	@PostMapping(
			produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
			consumes={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
			)
	public Account insertAccounts(@RequestBody Account account){
		account.setAccountNo(1001);
		return account;
	}
	
	
	@PutMapping(
			produces={MediaType.APPLICATION_JSON_VALUE},
			consumes={MediaType.APPLICATION_XML_VALUE}
			)
	public Account updateAccounts(@RequestBody Account account){
		account.setAccountNo(1001);
		account.setBalance(34535.45f);
		account.setAccountType("saving");
		return account;
	}
	
	@DeleteMapping("/{id}")
	public String  deleteAccounts(@PathVariable("id") int accountNo){
		return accountNo+" is deleeted";
	}
	
	
}
