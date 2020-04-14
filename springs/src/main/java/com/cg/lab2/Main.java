package com.cg.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.lab2.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    Employee obj = (Employee) context.getBean("emp1"); //this is bean id constructor  injects  data into another class
	    
	    
	    System.out.println("Employee details");
	    System.out.println("----------------------------------------------------------------------------------------");
	    System.out.println("Employee id : "+obj);
	    System.out.println("Employee name : "+obj.getBusinessUnit());
	}
}
