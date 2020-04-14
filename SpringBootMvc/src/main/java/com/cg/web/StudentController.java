package com.cg.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.entity.Student;

@Controller
public class StudentController {
	
	@GetMapping("/stuform")
	public String displayStudentForm(Model model) {
		model.addAttribute("smodel", new Student());
		return "StudentFormPage";
	}
	
	@PostMapping("/stusubmit")
	public String calcStud(@Valid @ModelAttribute("smodel") Student stu,BindingResult br,Model model) {
		if(br.hasErrors()) {
			return "StudentFormPage";
		}
		
		return "StuSubmitPage";
	}

}
