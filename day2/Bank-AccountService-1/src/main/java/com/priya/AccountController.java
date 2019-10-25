package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Autowired
	AccountRepository accountRepository;

	@RequestMapping("/{userid}/getaccount")
	public Account byUsername(@PathVariable("userid") int userid) {
		// System.out.println("inside by id" +userName);
		Account account = (Account) accountRepository.findAccountByUserid(userid);
		return account;
	}
	
	@RequestMapping("/{accountno}/get")
	public Account byAccountno(@PathVariable("accountno") int accountno) {
		// System.out.println("inside by id" +userName);
		Account account = (Account) accountRepository.findAccountByAccountno(accountno);
		return account;
	}
	
	@PostMapping("/addaccount")
	public String addAccount(@RequestBody Account account) {
		// System.out.println("inside by id" +userName);
		accountRepository.save(account);
		return "account inserted";
	}
	
	
	
	@DeleteMapping("/{accountno}/deleteaccount")
	public String DeleteById(@PathVariable("accountno") int userid) {
		// System.out.println("inside by id" +userName);
	         accountRepository.deleteById(userid);
		    return "account deleted";
	}

	
	
}

	
	
