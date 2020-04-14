package com.cg.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.lab3.Employee;
import com.cg.lab3.EmployeeConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		SBU obj=ctx.getBean(SBU.class);
		
		System.out.println("SBU details");
	    System.out.println("----------------------------------------------------------------------------------------");
	    System.out.println("SBU : "+obj);
	    System.out.println("\nEmployee details");
	    System.out.println("----------------------------------------------------------------------------------------");
	    for(Employee ob:obj.getEmpList())
	    {
	    	System.out.println(ob);
	    }
	}

}
