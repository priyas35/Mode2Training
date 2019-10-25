package com.jwt.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Student")
public class Student implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "id", referencedColumnName = "id", nullable = true)
	private int id;
	
	
	@Column(name="rollnum")
	private int rollNum;

	@Column(name="sname")
	private String name;

	@Column
	private int age;

	@Column
	private String gender;
	
	@Column
	private String country;
	
	@Column
	private Date dateOfJoin;
	
	@Column
	private double finalScore;
	
	@Transient
	private String grade;

	public String getGrade() {
		
		
		Grade g=(double x)->{ String grade=x <= 40 ? "FAIL" : x <= 60 ? "SECONDCLASS" : x <= 75 ? "FIRSTCLASS" : "DISTINCTION" ;	return grade;};
	        
	    
	
		return g.setGradeString(finalScore);
	}

	public void setGrade(String grade) {
		
		this.grade = grade;
		
		
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public double getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
