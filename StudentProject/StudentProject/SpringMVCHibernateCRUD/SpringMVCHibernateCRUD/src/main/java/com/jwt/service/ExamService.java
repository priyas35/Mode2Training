package com.jwt.service;

import java.util.List;

import com.jwt.model.Exam;
import com.jwt.model.Student;

public interface ExamService {
	
	public void addExam(Exam employee);


	public void deleteExam(int employeeId,int id);


	public Exam updateExam(Exam employee);
	
	public Exam getExamById(int eid);
	public List<Exam> getExamsBySid(int sid);
}
