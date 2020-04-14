package com.cg.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.lab2.Employee;
import com.cg.lab2.EmployeeConfig;

public class Main {

	public static void main(String...args)
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee obj=ctx.getBean(Employee.class);
		
		System.out.println("Employee details");
	    System.out.println("----------------------------------------------------------------------------------------");
	    System.out.println("Employee id : "+obj.getEmployeeId());
	     System.out.println("Employee name : "+obj.getEmployeeName());
	     System.out.println("Salary : "+obj.getSalary());
	     System.out.println("Business Unit : "+obj.getBusinessUnit());
	}
}
	
