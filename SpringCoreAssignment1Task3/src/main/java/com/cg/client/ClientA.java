package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.ISearcher;

public class ClientA {
	
	static ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");

	public static void main(String[] args) {
		System.out.println("main starts");
		ISearcher service=ctx.getBean("mySer",ISearcher.class);
		System.out.println(service.search("jammu"));
		System.out.println(service.searchStartWith("ch"));
		System.out.println(service.displayAll());
	}
}

