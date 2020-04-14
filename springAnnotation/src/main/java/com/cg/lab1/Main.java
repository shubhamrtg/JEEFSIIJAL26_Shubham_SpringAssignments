package com.cg.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee obj=ctx.getBean(Employee.class);

		System.out.println("Employee id : "+obj.getEmployeeId());
	     System.out.println("Employee name : "+obj.getEmployeeName());
	     System.out.println("Salary : "+obj.getSalary());
	     System.out.println("Business Unit : "+obj.getBusinessUnit());
	     System.out.println("Age : "+obj.getAge());
	}

}
