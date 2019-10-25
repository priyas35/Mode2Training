package com.jwt.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Exam;
import com.jwt.model.Student;
import com.jwt.service.StudentService;

@Controller
public class StudentController {

	private static final Logger logger = Logger
			.getLogger(StudentController.class);

	public StudentController() {
		logger.info("StudentController");
		System.out.println("StudentController()");
	}

	@Autowired
	private StudentService StudentService;

	@RequestMapping(value = "/")
	public ModelAndView listStudent(ModelAndView model) throws IOException {
		logger.info("Priya Entering into listStudent method...");
		logger.info("Priya calling the student service andits getAllStudent......");
		List<Student> listStudent = StudentService.getAllStudents();
		model.addObject("listStudent", listStudent);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newStudent", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		logger.info("Priya Entering into new student method...");
		logger.info("Priya calling the student service andits getAllStudent......");
		Student student = new Student();
		/*student.setFinalScore((Float.parseFloat(request.getParameter("mark"))));*/
		model.addObject("student", student);
		model.setViewName("StudentForm");
		return model; 
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		logger.info("Priya Entering into new student method...");
		logger.info("Priya calling the student service andits getAllStudent......");
		if (student.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			StudentService.addStudent(student);
		} else {
			StudentService.updateStudent(student);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public ModelAndView deleteStudent(HttpServletRequest request) {
		logger.info("Priya Entering into deleteStudent method...");
		logger.info("Priya calling the student service andits getAllStudent......");
		int studentId = Integer.parseInt(request.getParameter("id"));
		StudentService.deleteStudent(studentId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) 
	{
		logger.info("Priya Entering into editStudent method...");
		logger.info("Priya calling the student service andits getAllStudent......");
		int studentId = Integer.parseInt(request.getParameter("id"));
		Student student = StudentService.getStudent(studentId);
		ModelAndView model = new ModelAndView("StudentForm");
		model.addObject("student", student);

		
		return model;
	}
	
	 @ModelAttribute("countryList")
	   public Map<String, String> getCountryList() {
	      Map<String, String> countryList = new HashMap<String, String>();
	      countryList.put("US", "United States");
	      countryList.put("CH", "China");
	      countryList.put("SG", "Singapore");
	      countryList.put("MY", "Malaysia");
	      return countryList;
	   }

}