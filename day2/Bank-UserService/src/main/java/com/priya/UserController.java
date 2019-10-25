package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	
	@RequestMapping("/{userName}/user")
	public User byId(@PathVariable("userName") String userName) {
		//System.out.println("inside by id" +userName);
		//User user = userRepository.getUserByuserName(userName).get(0);
		return new User();
	}
	
	
	

}
