package com.flm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flm.entity.Employee;
import com.flm.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping("/showEmployee")
	public String getAllEmployee(Model model) {
		List<Employee> emps = employeeRepository.findAll();
		model.addAttribute("abc", emps);
		return "home";
	}

}
