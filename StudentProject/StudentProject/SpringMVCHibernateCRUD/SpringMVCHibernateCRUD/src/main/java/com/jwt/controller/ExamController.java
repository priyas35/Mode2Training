package com.jwt.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Exam;
import com.jwt.model.Student;
import com.jwt.service.ExamService;

@Controller
public class ExamController {

	private static final Logger logger = Logger.getLogger(ExamController.class);

	public ExamController() {
		logger.info("ExamController");
		System.out.println("ExamController()");
	}

	@Autowired
	private ExamService examService;

	@RequestMapping(value = "/examShow")
	public ModelAndView listExam(ModelAndView model, HttpServletRequest request) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		logger.info("Priya Entering into listExam method...");
		logger.info("Priya calling the student service andits getAllStudent......");
		List<Exam> listExam = examService.getExamsBySid(id);

		for (Exam exam : listExam) {
			System.out.println(exam.getExamId());
		}
		model.addObject("listExam", listExam);
		model.setViewName("examShow");
		return model;
	}

	@RequestMapping(value = "/newExam", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model, HttpServletRequest request) {
		Exam exam = new Exam();
		exam.setId(Integer.parseInt(request.getParameter("id")));
		model.addObject("exam", exam);
		model.setViewName("ExamForm");
		return model;
	}

	@RequestMapping(value = "/saveExam", method = RequestMethod.POST)
	public ModelAndView saveExam(@ModelAttribute Exam exam) {
		/*
		 * System.out.println(exam.getSubName()); examService.addExam(exam);
		 * try{ examService.addExam(exam); }catch(DuplicateKeyException |
		 * ConstraintViolationException pke){ examService.updateExam(exam); }
		 * return new ModelAndView("redirect:/examShow");
		 */
		if (exam.getExamId() == 0) {
			examService.addExam(exam);
		} else {
			examService.updateExam(exam);
		}
		return new ModelAndView("redirect:/examShow?id=" + exam.getId());
	}

	@RequestMapping(value = "/deleteExam", method = RequestMethod.GET)
	public ModelAndView deleteExam(HttpServletRequest request) {

		int examId = Integer.parseInt(request.getParameter("examId"));
		int id = Integer.parseInt(request.getParameter("id"));
		examService.deleteExam(examId, id);
		return new ModelAndView("redirect:/examShow?id=" + id);
	}

	@RequestMapping(value = "/editExam", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int examsId = Integer.parseInt(request.getParameter("examId"));
		Exam exam = examService.getExamById(examsId);

		ModelAndView model = new ModelAndView("ExamForm");
		model.addObject("exam", exam);

		return model;
	}

	@ModelAttribute("subjectList")
	public Map<String, String> getCountryList() {
		Map<String, String> subjectList = new HashMap<String, String>();
		subjectList.put("Tamil", "Tamil");
		subjectList.put("Social", "Social");
		subjectList.put("Science", "Science");
		subjectList.put("Maths", "Maths");
		return subjectList;
	}

}
