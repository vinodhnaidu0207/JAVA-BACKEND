package com.flm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.entity.Employee;
import com.flm.exception.EmployeeNotFoundException;
import com.flm.form.EmployeeForm;
import com.flm.form.Response;
import com.flm.service.EmployeeService;
import com.flm.util.Converter;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

	private final EmployeeService employeeService;
	private final Converter converter;
	
	@PostMapping("/saveEmployee")
	public EmployeeForm saveEmployee(@RequestBody EmployeeForm employeeForm) {
		Employee emp = converter.getEmployee(employeeForm);
		emp= employeeService.saveEmployee(emp);
		return converter.getEmployeeForm(emp);
	}
	
	@GetMapping("/getEmployee/{id}")
	public Response getEmployee(@PathVariable Long id) throws EmployeeNotFoundException {
		return getEmployeeForm(id);
	}
	
	private Response getEmployeeForm(Long id) throws EmployeeNotFoundException {
		return employeeService.getEmployee(id);
	}
}
