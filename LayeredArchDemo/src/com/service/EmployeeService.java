package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	
	public List<Employee> addEmp(Employee e);
	
	public List<Employee> deleteEmp(Employee e);
	
	public List<Employee> getEmp();
	

}
