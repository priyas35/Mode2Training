package com.javainterviewpoint;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SaveLogic 
{
    private static SaveLogic saveLogic;
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    public static void main( String[] args )
    {
        //Reading the Configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        
        //Get the SaveLogic bean
        saveLogic = (SaveLogic)context.getBean("saveLogic");
        
        saveLogic.saveEmployee();
        
        context.close();
    }
    
    public void saveEmployee()
    {
        Employee employee = new Employee();
        employee.setEmpName("JIP");
        
        Employee_Address employeeAddress1 = new Employee_Address();
        employeeAddress1.setStreet("Street 1");
        employeeAddress1.setCity("City 1");
        employeeAddress1.setCountry("India");
        employeeAddress1.setState("Kerala");
        employeeAddress1.setEmployee(employee);
        
        
        Employee_Address employeeAddress2 = new Employee_Address();
        employeeAddress2.setStreet("Street 2");
        employeeAddress2.setCity("City 2");
        employeeAddress2.setCountry("India");
        employeeAddress2.setState("Tamilnadu");
        employeeAddress2.setEmployee(employee);
        
        Employee_Address employeeAddress3 = new Employee_Address();
        employeeAddress3.setStreet("Street 1");
        employeeAddress3.setCity("City 1");
        employeeAddress3.setCountry("US");
        employeeAddress3.setState("mumbai");
        employeeAddress3.setEmployee(employee);
        
        
        Employee_Address employeeAddress4 = new Employee_Address();
        employeeAddress4.setStreet("Street 2");
        employeeAddress4.setCity("City 2");
        employeeAddress4.setCountry("US");
        employeeAddress4.setState("karnataka");
        employeeAddress4.setEmployee(employee);
        
        
        
        Set<Employee_Address> employeeAddressSet = new HashSet<Employee_Address>();
        employeeAddressSet.add(employeeAddress1);
        employeeAddressSet.add(employeeAddress2);
        employeeAddressSet.add(employeeAddress3);
        employeeAddressSet.add(employeeAddress4);
        
        
        employee.setEmployeeAddress(employeeAddressSet);
        
        
        
        
        
        employeeRepository.save(employee);
        System.out.println("Employee and Employee Address saved successfully!!");
        
       
    }
}
