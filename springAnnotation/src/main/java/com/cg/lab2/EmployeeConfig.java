package com.cg.lab2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig 
{
	@Bean
	@Scope("singleton")
	public SBU sbu()
	{
		SBU sbuObj=new SBU();
		sbuObj.setSbuId(123123);
		sbuObj.setSbuName("FSBU");
		sbuObj.setSbuHead("Suresh");
		return sbuObj;
	}
	
	@Bean
	@Scope("singleton")
	public Employee employee()
	{
		Employee emp=new Employee();
		emp.setBusinessUnit(sbu());
		emp.setEmployeeId(123);
		emp.setEmployeeName("Shubham");
		emp.setSalary(50000);
		return emp;
	}
}
