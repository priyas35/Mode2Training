package com.priya;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personaldetails")
public class Mortgageapp {
	/*
	 * accountNo int not null primary key, amount double, accountType char, userId
	 * int(13),
	 */

	   @Id
	   @Column(name="id")
	   private int id;
	   @Column(name="firstname")
	   private String firstname;
	   @Column(name="lastname")
	   private int lastname;
	   @Column(name="dob")
	   private Date dob;
	   @Column(name="address")
	   private String address;
	   @Column(name="city")
	   private String city;
	   @Column(name="state")
	   private String state;
	   @Column(name="pincode")
	   private String pincode;
	   @Column(name="mobileno")
	   private String mobileno;
	   @Column(name="userid")
	   private String userid;
	   
	   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getLastname() {
		return lastname;
	}
	public void setLastname(int lastname) {
		this.lastname = lastname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	 public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
	   
	   
	   
	   
	   
}	   
	   
	