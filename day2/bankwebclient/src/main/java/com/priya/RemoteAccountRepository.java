package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteAccountRepository implements AccountRepository{
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteAccountRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	

	@Override
	public Account byUserId(int userid) {
		return restTemplate.getForObject(serviceUrl + "/{userid}/getaccount",
				Account.class, userid);

	}

	@Override
	public Account byAccountNo(int accountno) {
		return restTemplate.getForObject(serviceUrl + "/{accountno}/get",
				Account.class, accountno);

	}

	@Override
	public String addAccount(Account account) {
		 restTemplate.getForObject(serviceUrl + "/addaccount",
				Account.class, account);
		 return "Account Added";

	}

	@Override
	public String DeleteById(int userid) {
		 restTemplate.getForObject(serviceUrl + "/{accountno}/deleteaccount",
				Account.class, userid);
		 return "Account Deleted";
	}

}
