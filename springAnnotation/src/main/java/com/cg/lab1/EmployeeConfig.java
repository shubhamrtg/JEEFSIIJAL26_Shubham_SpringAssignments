package com.cg.lab1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig 
{
	@Bean
	@Scope("singleton")
	public Employee employee()
	{
		Employee emp=new Employee();
		emp.setAge(21);
		emp.setBusinessUnit("FSBU");
		emp.setEmployeeId(123);
		emp.setEmployeeName("Shubham");
		emp.setSalary(50000);
		return emp;
	}
}
