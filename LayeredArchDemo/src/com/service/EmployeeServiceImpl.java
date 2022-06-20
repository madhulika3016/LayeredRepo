package com.service;

import java.util.List;

import com.dao.EmployeeDAO;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService
{
	EmployeeDAO dao=new EmployeeDAO();

	@Override
	public List<Employee> addEmp(Employee e) {
		List<Employee> ls=dao.addE(e);
		return ls;
	}

	@Override
	public List<Employee> deleteEmp(Employee e) {
		List<Employee> ls=dao.deleteE(e);
		return ls;
	}

	@Override
	public List<Employee> getEmp() {
		List<Employee> le=dao.getE();
		return le;
	}
}
