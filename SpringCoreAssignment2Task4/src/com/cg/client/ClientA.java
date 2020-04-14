package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.service.ICurrencyService;
import com.cg.service.MyConfig;

public class ClientA {
	
	static ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);

	public static void main(String[] args) {
		System.out.println("main starts");
		ICurrencyService service=ctx.getBean("mySer",ICurrencyService.class);
		System.out.println(service.convertToINR(100));
		System.out.println(service.currentState());
	}
}
