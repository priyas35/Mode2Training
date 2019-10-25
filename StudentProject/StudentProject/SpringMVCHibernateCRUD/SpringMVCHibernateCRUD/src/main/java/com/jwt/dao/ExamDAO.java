package com.jwt.dao;

import java.util.List;
import com.jwt.model.Exam;
import com.jwt.model.Student;

public interface ExamDAO {

	public void addExam(Exam employee);

	/*public List<Exam> getAllExams();*/

	public void deleteExam(Integer employeeId);

	public Exam updateExam(Exam employee);

	/*public Exam getExam(int employeeid);*/
	public Exam getExamById(int eid);
	public List<Exam> getExamsBySid(int sid);
	/*public double getAvgMarks(int sid);
	public Student getStudentById(int id);*/
	public void updateStudentFinalScore(int id);
	/*public void updateStudent(Student student);*/
}
