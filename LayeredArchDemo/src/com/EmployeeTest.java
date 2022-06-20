package com;

import java.util.List;

import com.model.Employee;
import com.service.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeServiceImpl emps=new EmployeeServiceImpl();
		
		//List<Employee> lse=emps.getEmp();
		/*
		 * for(Employee e:lse) { System.out.println(e); }
		 */
		  Employee emp=new Employee(1006,"Sia","PHP");
		  
		  List<Employee> ls=emps.addEmp(emp);
		  
			/*
			 * for(Employee e:ls) { System.out.println(e); }
			 */
		  
		  
		  List<Employee> ls1=emps.deleteEmp(emp);
		  
		 for(Employee e:ls) 
		 { System.out.println(e); 
		 }
		 
	}

}
