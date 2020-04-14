package com.cg.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cg.service.IService;

@SuppressWarnings("deprecation")
public class ClientB {
	static BeanFactory fac;
	
	static {
		Resource res= new ClassPathResource("beans.xml");
		fac= new XmlBeanFactory(res);
	}

	public static void main(String[] args) {
		System.out.println("main starts");
		IService service=fac.getBean("mySer",IService.class);
		System.out.println(service.viewName());
		
		System.out.println("second demand");
		IService service1=fac.getBean("mySer",IService.class);
		System.out.println(service1.viewName());
	}

}