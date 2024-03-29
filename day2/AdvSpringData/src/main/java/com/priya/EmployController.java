package com.priya;


import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployController {

	
	
	

	@Autowired
	EmployRepository emprep;
	
	int NumOfRecords=2;
	int numOfPages;
	

	@RequestMapping(value = "/")
	public ModelAndView getEmployees() {
	ModelAndView mv=new ModelAndView();
	 List<Employ> employeeList = (List<Employ>) emprep.findAll();
	 numOfPages = employeeList.size()/NumOfRecords +employeeList.size()%NumOfRecords;
	 mv.addObject("employeeList", employeeList);
	 mv.addObject("pages", numOfPages);
	 mv.setViewName("home");
	 return mv;
	
	}
	
	@RequestMapping(value = "/displayjavacontractors")
	public ModelAndView getjavacontractors() {
	ModelAndView mv=new ModelAndView();
	 mv.addObject("employeeList", emprep.findByDeptAndDesig("mech", "student"));
	 mv.setViewName("home");
	 return mv;
	
	}
	
	@RequestMapping(value = "/displaystudents")
	public ModelAndView getstudents() {
	ModelAndView mv=new ModelAndView();
	 mv.addObject("employeeList", emprep.findByDesig("student"));
	 mv.setViewName("home");
	 return mv;
	
	}
	
	@RequestMapping(value = "/displaymanagers")
	public ModelAndView getmanagers() {
	ModelAndView mv=new ModelAndView();
	 mv.addObject("employeeList", emprep.findByDesig("manager"));
	 mv.setViewName("home");
	 return mv;
	
	}
	
	@RequestMapping(value = "/displaystudentswith5000moresalary")
	public ModelAndView getstudenthaving1000salary() {
	ModelAndView mv=new ModelAndView();
	 mv.addObject("employeeList", emprep.findByDesigAndSalary("student",1000));
	 mv.setViewName("home");
	 return mv;
	
	}
	
	@RequestMapping(value = "/namestartswitha")
	public ModelAndView getdeptAndName() {
	ModelAndView mv=new ModelAndView();
	 mv.addObject("employeeList", emprep.findByDesigAndName("student"));
	 mv.setViewName("home");
	 return mv;
	
	}
	@RequestMapping(value = "/sortbydesig")
	public ModelAndView sortbydesig() {
	ModelAndView mv=new ModelAndView();
	 mv.addObject("employeeList", emprep.findAll(Sort.by("desig")));
	 mv.setViewName("home");
	 return mv;
	
	}
	@RequestMapping(value = "/sortbydesigdecending")
	public ModelAndView sortbydesigdesending() {
	ModelAndView mv=new ModelAndView();
	 mv.addObject("employeeList", emprep.findAll(Sort.by("desig").descending()));
	 mv.setViewName("home");
	 return mv;
	
	}
	@RequestMapping(value = "/sortbydeptandsalarydecending")
	public ModelAndView sortbydesigandsalarydesending() {
	ModelAndView mv=new ModelAndView();
	 mv.addObject("employeeList", emprep.findAll(Sort.by("dept").descending().and(Sort.by("basic").descending())));
	 mv.setViewName("home");
	 return mv;
	
	}
	@RequestMapping(value = "/displaystudentssortsalarybydecending")
	public ModelAndView displaymanagerssortsalarybydecending() {
	ModelAndView mv=new ModelAndView();
	 mv.addObject("employeeList", emprep.sortByDesig("student", "basic"));
	 mv.setViewName("home");
	 return mv;
	
	}
	@RequestMapping(value = "/sortByDesigdeptandname")
	public ModelAndView sortByDesigdeptandname() {
	ModelAndView mv=new ModelAndView();
	 mv.addObject("employeeList", emprep.sortByDesigdeptandname("student","basic"));
	 mv.setViewName("home");
	 return mv;
	
	}
	
	@RequestMapping(value = "/displayAll/Page/{pageno}")
	public ModelAndView page1(@PathVariable("pageno")int pageno) {
	ModelAndView mv=new ModelAndView();
	Page<Employ> pages=emprep.findAll(PageRequest.of(pageno, NumOfRecords));
	 mv.addObject("pages", numOfPages);
	 mv.addObject("employeeList", (pages).getContent());
	 mv.setViewName("home");
	 return mv;
	
	}
	
	
	
}

