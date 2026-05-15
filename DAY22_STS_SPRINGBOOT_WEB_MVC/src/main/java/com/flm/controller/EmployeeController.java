package com.flm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flm.dao.EmployeeDao;
import com.flm.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao employeeDao;

	@RequestMapping("/empinfo")
	public String employeeInfo(Model model) {
		List<Employee>emps = employeeDao.getAllEmployees();
		model.addAttribute("xyz", emps);
		return "employeeinfo";
	}
}
