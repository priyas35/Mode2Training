package com.journaldev.jaxrs.dao;



import java.util.List;

import com.journaldev.jaxrs.model.Employee;


public interface EmployeeDAO {

	public void addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployee(int employeeid);

	
	
}
