package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dao.IEmpDao;
import com.cg.entity.Dept;

public class AddDept {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jpaconfig.xml");
		IEmpDao dao= ctx.getBean("mydao",IEmpDao.class);
		Dept dept=new Dept();
		dept.setDeptName("hr");
		dao.addDept(dept);
		System.out.println("dept added");
		
		dept=new Dept();
		dept.setDeptName("finance");
		dao.addDept(dept);
		System.out.println("dept added");
		
		dept=new Dept();
		dept.setDeptName("production");
		dao.addDept(dept);
		System.out.println("dept added");
	}
}
