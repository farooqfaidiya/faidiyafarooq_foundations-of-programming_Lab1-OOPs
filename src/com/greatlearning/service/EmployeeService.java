package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface EmployeeService {
	
	String generateEmailID (String fisrName,String lastName,String deptName);
	String generatePassword();
	void showEmployeeDetails(Employee e);

}
