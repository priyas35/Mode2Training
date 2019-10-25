package com.jwt.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Exam;
import com.jwt.model.Student;

@Repository
public class ExamDAOImpl implements ExamDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addExam(Exam exam) {
		sessionFactory.getCurrentSession().saveOrUpdate(exam);

	}

	/*@SuppressWarnings("unchecked")
	public List<Exam> getAllExams() {
		return sessionFactory.getCurrentSession().createQuery("from Exam").list();
	}*/

	@Override
	public void deleteExam(Integer employeeId) {
		Exam employee = (Exam) sessionFactory.getCurrentSession().load(
				Exam.class, employeeId);
		if (null != employee) {
			this.sessionFactory.getCurrentSession().delete(employee);
		}

	}

	public Exam getExam(int empid) {
		return (Exam) sessionFactory.getCurrentSession().get(
				Exam.class, empid);
	}

	@Override
	public Exam updateExam(Exam employee) {
		sessionFactory.getCurrentSession().update(employee);
		return employee;
	}
	
	@Override
	public Exam getExamById(int eid) {
		return (Exam) sessionFactory.getCurrentSession().get(
				Exam.class, eid);
	}

	/*@Override
	public double getAvgMarks(int sid) {
		// select avg(mark) from exam where sid = sid;
		Criteria cr =  sessionFactory.getCurrentSession().createCriteria(Exam.class);
		Projection p = Projections.avg("mark");
		cr.setProjection(p);
		Criterion crId = Restrictions.eq("id", sid);
		cr.add(crId);
		double avgMarks = (double)cr.uniqueResult();
		return avgMarks;
	}
*/
	/*@Override
	public Student getStudentById(int id) {
		return (Student) sessionFactory.getCurrentSession().get(
				Student.class, id);
	}
*/
	@Override
	public void updateStudentFinalScore(int sid) {
		/*double marks = getAvgMarks(sid) ;
		Student student = getStudentById(sid);
		student.setFinalScore( marks);
		updateStudent(student);*/
		List list=sessionFactory.getCurrentSession().createQuery("from Student where id="+sid).list();
		Student st=(Student)list.get(0);
		 list=sessionFactory.getCurrentSession().createQuery("select avg(mark) from Exam where id=" +sid).list();
		 if(list.get(0)!=null){
			 st.setFinalScore((double) list.get(0));
		 }else{
			 st.setFinalScore(0.0f);
		 }
		 sessionFactory.getCurrentSession().update(st);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Exam> getExamsBySid(int sid) {
		return sessionFactory.getCurrentSession().createQuery("from Exam where id="+sid).list();
	}
	
	/*@Override
	public void updateStudent(Student student) {
		sessionFactory.getCurrentSession().update(student);
	}
*/

}