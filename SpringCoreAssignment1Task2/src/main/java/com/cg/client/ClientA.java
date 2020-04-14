package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.ICurrencyService;

public class ClientA {
	
	static ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");

	public static void main(String[] args) {
		System.out.println("main starts");
		ICurrencyService service=ctx.getBean("mySer",ICurrencyService.class);
		System.out.println(service.convertToINR(100));
		System.out.println(service.currentState());
	}
}
