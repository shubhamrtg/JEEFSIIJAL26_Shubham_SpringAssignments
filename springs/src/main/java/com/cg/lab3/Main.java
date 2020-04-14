package com.cg.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    SBU obj = (SBU) context.getBean("Sbu"); //this is bean id constructor  injects  data into another class
	    
	    
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
