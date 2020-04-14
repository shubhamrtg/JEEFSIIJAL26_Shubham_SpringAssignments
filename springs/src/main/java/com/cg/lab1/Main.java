package com.cg.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.lab1.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    Employee obj = (Employee) context.getBean("emp"); //this is bean id constructor  injects  data into another class
	    
	     System.out.println("Employee id : "+obj.getEmployeeId());
	     System.out.println("Employee name : "+obj.getEmployeeName());
	     System.out.println("Salary : "+obj.getSalary());
	     System.out.println("Business Unit : "+obj.getBusinessUnit());
	     System.out.println("Age : "+obj.getAge());

	}

}
