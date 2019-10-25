package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ExamDAO;
import com.jwt.model.Exam;
import com.jwt.model.Student;

@Service
@Transactional
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamDAO examDao;

	@Override
	@Transactional
	public void addExam(Exam employee) {
		examDao.addExam(employee);
		examDao.updateStudentFinalScore(employee.getId());
	}

	/*@Override
	@Transactional
	public List<Exam> getAllExams() {
		return examDao.getAllExams();
	}*/

	@Override
	@Transactional
	public void deleteExam(int employeeId,int id) {
		examDao.deleteExam(employeeId);
		System.out.println("SID : "+ id);
		examDao.updateStudentFinalScore(id);
	}

	/*public Exam getExam(int empid) {
		return examDao.getExam(empid);
	}*/

	public Exam updateExam(Exam employee) {
		// TODO Auto-generated method stub
		employee=examDao.updateExam(employee);
		examDao.updateStudentFinalScore(employee.getId());
		return employee;
		
	}

	public void setExamDAO(ExamDAO employeeDAO) {
		this.examDao = employeeDAO;
	}
	
	public List<Exam> getExamsBySid(int sid) {
		return examDao.getExamsBySid(sid);
	}

	

	public void setExamDao(ExamDAO examDao) {
		this.examDao = examDao;
	}

	@Override
	public Exam getExamById(int eid) {
		return examDao.getExamById(eid);
	}

	/*@Override
	public void updateStudentFinalScore(int sid) {
		// get final score for student 
		double avgMarks = examDao.getAvgMarks(sid);
		Student student = examDao.getStudentById(sid);
		student.setFinalScore((float) avgMarks);
		examDao.updateStudent(student);
		// update final score
		
	}*/

}