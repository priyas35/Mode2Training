package com.priya;


public interface AccountRepository {
	
	public Account byUserId(int userid);
	public Account byAccountNo(int accountno);
	public String addAccount( Account account);
	public String DeleteById(int userid);

}
