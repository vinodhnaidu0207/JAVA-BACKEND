package com.flm.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.flm.entity.Employee;
import com.flm.exception.EmployeeNotFoundException;
import com.flm.form.DepartmentForm;
import com.flm.form.EmployeeForm;
import com.flm.form.Response;
import com.flm.repository.EmployeeRepository;
import com.flm.util.Converter;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

	private final EmployeeRepository EmployeeRepository;
	private final RestTemplate restTemplate;
	private final Converter converter;

	public Employee saveEmployee(Employee employee) {
		return EmployeeRepository.save(employee);
	}
	
	public Response getEmployee(Long id) throws EmployeeNotFoundException {
		Response response = new Response();
		EmployeeForm empform = null;
		Optional<Employee> optemp = EmployeeRepository.findById(id);
		if(optemp.isPresent()) {
			empform = converter.getEmployeeForm(optemp.get());
			response.setEmployeeForm(empform);
		}else
		throw new EmployeeNotFoundException("Employee Is Not Found.....");
		
		DepartmentForm departmentForm = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/getDepartment/"+empform.getDeptId(), DepartmentForm.class);
		response.setDepartmentForm(departmentForm);
		return response;
	}
}
