package com.cg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

@Controller
@EnableTransactionManagement
public class EmpManipulateController {

	@Autowired
	private IEmpDao dao;
	
	@GetMapping("showaddform")
	public String showAddEmployee(Model model)
	{
		model.addAttribute("dlist", dao.viewDepts());
		return "AddEmpPage";
	}
	
	@PostMapping("/add")
	public String addEmployee(@ModelAttribute("emodel") Emp emp, Model model)
	{
		try
		{
			dao.addEmp(emp);
			model.addAttribute("msg", "Employee Added");
			return "HomePage";
		}
		catch(Exception e)
		{
			System.out.println("Message : "+e.getMessage());
			model.addAttribute("dlist", dao.viewDepts());
			model.addAttribute("msg", "ID already exists");
			return "AddEmpPage";
		}
	}
}
