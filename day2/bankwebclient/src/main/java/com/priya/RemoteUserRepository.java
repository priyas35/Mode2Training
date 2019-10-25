package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteUserRepository implements UserRepository{
	
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteUserRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	

	@Override
	public User byUsername(String username) {
		return restTemplate.getForObject(serviceUrl + "/{username}/user",
				User.class, username);
	}

}
