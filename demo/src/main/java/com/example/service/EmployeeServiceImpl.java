package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employRepository;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=(List<Employee>) employRepository.findAll();
		if(list.size() > 0) {
			return list;
		}
		else {
			return new ArrayList<Employee>();
		}
	
	
	}

	@Override
	public String addEmployee(String empStr) {
		JSONArray jsonArray = (JSONArray) JSONValue.parse(empStr);
		Employee emp=new Employee();
		 
		for (int i = 0; i < jsonArray.size(); i++) {
			
			JSONObject a = (JSONObject) jsonArray.get(i);
			long id = (long) a.get("id");
			emp.setId((int)id);
			String name = (String) a.get("name");
			emp.setName(name);
			double salary = (long) a.get("salary");
			emp.setSalary(salary);
					
		}
	           Employee tempEmp=employRepository.save(emp);
		
			
			 if(tempEmp != null) { 
				 return "Employee Successfully Created"; 
				 }else {
					 return "employee not created"; }
			
		
		
	}

	@Override
	public String deleteEmployee(Integer employeeId) {
		 employRepository.deleteById(employeeId);
	         return "Employee Deleted";
		
	}

	/*
	 * @Override public Employee updateEmployee(Employee employee) {
	 * employee=employRepository.save(employee); return employee; }
	 */

	@Override
	public Optional<Employee> getEmployee(int employeeid) {
		return employRepository.findById(employeeid);
	}

	@Override
	public String addEmployees(String empstr) {
		
		JSONArray jsonArray = (JSONArray) JSONValue.parse(empstr);
		
		List<Employee> lst=new ArrayList<Employee>();
		for (int i = 0; i < jsonArray.size(); i++) {
			Employee emp=new Employee();
			JSONObject a = (JSONObject) jsonArray.get(i);
			long id = (long) a.get("id");
			emp.setId((int)id);
			String name = (String) a.get("name");
			emp.setName(name);
			double salary = (long) a.get("salary");
			emp.setSalary(salary);
			lst.add(emp);
			
		}
		
		List<Employee> tempEmp=(List<Employee>) employRepository.saveAll(lst);
		
		
		 if(tempEmp != null) { 
			 return "Employee Successfully Created"; 
			 }else {
				 return "employee not created"; 
				 }
		
		
		
	}

	@Override
	public String deleteEmployees(String empstr) {
		
		
       JSONArray jsonArray = (JSONArray) JSONValue.parse(empstr);
		
		List<Employee> lst=new ArrayList<Employee>();
		for (int i = 0; i < jsonArray.size(); i++) {
			Employee emp=new Employee();
			JSONObject a = (JSONObject) jsonArray.get(i);
			long id = (long) a.get("id");
			emp.setId((int)id);
			String name = (String) a.get("name");
			emp.setName(name);
			double salary = (long) a.get("salary");
			emp.setSalary(salary);
			lst.add(emp);
			
		}
		
		 employRepository.deleteAll(lst);
		
		
		 return "Deleted Successfully";
	}

	@Override
	public String updateEmployee(String empstr) {
		
		JSONArray jsonArray = (JSONArray) JSONValue.parse(empstr);
		Employee emp=new Employee();
		 
		for (int i = 0; i < jsonArray.size(); i++) {
			
			JSONObject a = (JSONObject) jsonArray.get(i);
			long id = (long) a.get("id");
			emp.setId((int)id);
			String name = (String) a.get("name");
			emp.setName(name);
			double salary = (long) a.get("salary");
			emp.setSalary(salary);
					
		}
	           Employee tempEmp=employRepository.save(emp);
		
			
			
				 return "Employee Successfully updated"; 
				
		
	}

	@Override
	public String updateEmployees(String empstr) {
JSONArray jsonArray = (JSONArray) JSONValue.parse(empstr);
		
		List<Employee> lst=new ArrayList<Employee>();
		for (int i = 0; i < jsonArray.size(); i++) {
			Employee emp=new Employee();
			JSONObject a = (JSONObject) jsonArray.get(i);
			long id = (long) a.get("id");
			emp.setId((int)id);
			String name = (String) a.get("name");
			emp.setName(name);
			double salary = (long) a.get("salary");
			emp.setSalary(salary);
			lst.add(emp);
			
		}
		
		List<Employee> tempEmp=(List<Employee>) employRepository.saveAll(lst);
		
		
		return "Employee Updated Successfully";
		
	}
		
		
	

}
