package com.cg.lab3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig 
{
	@Bean
	@Scope("singleton")
	public Employee employee1()
	{
		Employee emp=new Employee();
		emp.setEmployeeId(123);
		emp.setEmployeeName("Shubham");
		emp.setSalary(40000);
		return emp;
	}
	@Bean
	@Scope("singleton")
	public Employee employee2()
	{
		Employee emp=new Employee();
		emp.setEmployeeId(124);
		emp.setEmployeeName("Shashwat");
		emp.setSalary(50000);
		return emp;
	}
	@Bean
	@Scope("singleton")
	public Employee employee3()
	{
		Employee emp=new Employee();
		emp.setEmployeeId(125);
		emp.setEmployeeName("Madhu");
		emp.setSalary(30000);
		return emp;
	}
	
	@Bean
	@Scope("singleton")
	public SBU sbu()
	{
		SBU sbuObj=new SBU();
		sbuObj.setSbuId(123123);
		sbuObj.setSbuName("FSBU");
		sbuObj.setSbuHead("Suresh");
		List<Employee> listOfEmp=new ArrayList<Employee>();
		listOfEmp.add(employee1());
		listOfEmp.add(employee2());
		listOfEmp.add(employee3());
		sbuObj.setEmpList(listOfEmp);
		return sbuObj;
	}
}
