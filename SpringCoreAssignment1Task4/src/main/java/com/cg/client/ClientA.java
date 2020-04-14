package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.IService;

public class ClientA {
	
	static ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");

	public static void main(String[] args) {
		System.out.println("main starts");
		IService service=ctx.getBean("mySer",IService.class);
		System.out.println(service.getEmployee(1001));
	}
}
