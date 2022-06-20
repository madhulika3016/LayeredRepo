package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeDAO {
	public List<Employee> emplist;
	
	public EmployeeDAO()
	{
		emplist=new ArrayList<Employee>();
		
		Employee e1=new Employee(1001,"Arun","Java");
		Employee e2=new Employee(1002,"Tarun","JavaFS");
		Employee e3=new Employee(1003,"Divya","AI");
		Employee e4=new Employee(1004,"Tina","ML");
		Employee e5=new Employee(1005,"Rina","Python");
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		}
	
	public List<Employee> getE()
	{
		return emplist;
	}
	
	public List<Employee> addE(Employee e)
	{
		emplist.add(e);
		return emplist;
	}
	
	public List<Employee> deleteE(Employee e)
	{
		emplist.remove(e);
		return emplist;
	}
	

}
