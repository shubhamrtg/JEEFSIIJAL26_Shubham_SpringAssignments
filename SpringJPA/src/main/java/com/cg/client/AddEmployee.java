package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

public class AddEmployee {

	ApplicationContext ctx=new ClassPathXmlApplicationContext("jpaconfig.xml");
	IEmpDao dao= ctx.getBean("mydao",IEmpDao.class);
	Emp obj=new Emp();
	obj.setEmpId(1001);
}
