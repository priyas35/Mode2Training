package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Exam")
public class Exam implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	
	
	@Column(name="id")
	private int id;
	
	@Id
	@Column(name="examId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int examId;

	@Column
	private String subName;

	@Column
	private double mark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	

}