package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MartgageController {

	@Autowired
	MortgageRepository accountRepository;

	/*
	 * @RequestMapping("/{userid}/getaccount") public Mortgageapp
	 * byUsername(@PathVariable("userid") int userid) { //
	 * System.out.println("inside by id" +userName); Mortgageapp account =
	 * (Mortgageapp) accountRepository.findAccountByUserid(userid); return account;
	 * }
	 * 
	 * 
	 * 
	 * @RequestMapping("/{accountno}/get") public Mortgageapp
	 * byAccountno(@PathVariable("accountno") int accountno) { //
	 * System.out.println("inside by id" +userName); Mortgageapp account =
	 * (Mortgageapp) accountRepository.findAccountByAccountno(accountno); return
	 * account; }
	 */
	@PostMapping("/saveapplicant")
	public String addAccount(@RequestBody Mortgageapp account) {
		// System.out.println("inside by id" +userName);
		accountRepository.save(account);
		return "account inserted";
	}
	
	
	
	/*
	 * @DeleteMapping("/{accountno}/deleteaccount") public String
	 * DeleteById(@PathVariable("accountno") int userid) { //
	 * System.out.println("inside by id" +userName);
	 * accountRepository.deleteById(userid); return "account deleted"; }
	 */

	
	
}

	
	
