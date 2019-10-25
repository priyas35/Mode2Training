package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/{username}/user")
	public User byUsername(@PathVariable("username") String username) {
		//System.out.println("inside by id" +userName);
		User user = (User) userRepository.getUserByusername(username);
		return user;
	}
}
