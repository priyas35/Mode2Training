package com.priya;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AccountController {
	
	@Autowired
	private RemoteAccountRepository remoteAccount;

	@RequestMapping(value = "/accountShow")
	public ModelAndView loginUser(ModelAndView model,HttpServletRequest request) throws IOException {
		int userid = Integer.parseInt(request.getParameter("userid"));
		remoteAccount.byAccountNo(userid);
		model.setViewName("accountShow");
		return model;
	}


}
