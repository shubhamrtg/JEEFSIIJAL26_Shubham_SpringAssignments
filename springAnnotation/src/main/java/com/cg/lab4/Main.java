package com.cg.lab4;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.lab4.EmployeeConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employees obj=ctx.getBean(Employees.class);
		
		System.out.println("Enter Employee ID");
	    Scanner scan=new Scanner(System.in);
	    int employeeId=scan.nextInt();
	    int flag=0;
	    for(Employee emp:obj.emplist)
	    {
		    if(employeeId==emp.getEmployeeId())
		    {
		    	System.out.println(emp.getEmployeeName());
		    	System.out.println(emp.getSalary());
		    	flag=1;
		    }
	    }
	    if(flag==0)
	    	System.out.println("Employee does not exist");
	}

}
