package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public String addEmployee(String empstr);
	
	public String addEmployees(String empstr);
	
	public String deleteEmployee(Integer employeeId);
	
	public String deleteEmployees(String empstr);

	public String updateEmployee(String empstr);
	public String updateEmployees(String empstr);

	public  Optional<Employee> getEmployee(int employeeid);



}
