package com.priya;


public class Account {
	/*
	 * accountNo int not null primary key, amount double, accountType char, userId
	 * int(13),
	 */

	   private int accountno;
	   private double amount;
	   private char accounttype;
	   private int userid;
	   
	   
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Account(int accountno, double amount, char accounttype, int userid) {
		super();
		this.accountno = accountno;
		this.amount = amount;
		this.accounttype = accounttype;
		this.userid = userid;
	}


	public int getAccountno() {
		return accountno;
	}


	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public char getAccounttype() {
		return accounttype;
	}


	public void setAccounttype(char accounttype) {
		this.accounttype = accounttype;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	
	   
	   
}
