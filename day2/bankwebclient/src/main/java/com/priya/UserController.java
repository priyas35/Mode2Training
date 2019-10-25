package com.priya;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.bouncycastle.asn1.x509.UserNotice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {
	
	
	@Autowired
	private RemoteUserRepository remoteUser;

	@RequestMapping(value = "/")
	public ModelAndView loginUser(ModelAndView model,HttpServletRequest request) throws IOException {
		String username = request.getParameter("username");
	    remoteUser.byUsername(username);
		model.setViewName("home");
		return model;
	}

}
