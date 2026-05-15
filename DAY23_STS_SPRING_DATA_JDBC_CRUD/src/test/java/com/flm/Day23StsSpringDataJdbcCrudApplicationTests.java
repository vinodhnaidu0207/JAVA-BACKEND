package com.flm;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flm.entity.Employee;
import com.flm.repository.EmployeeRepository;

@SpringBootTest
class Day23StsSpringDataJdbcCrudApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//@Test
	void testsaveEmployee() {
		Employee emp = new Employee("Nani","Karnool", 8000D);
		emp=employeeRepository.save(emp);
		System.out.println(emp);
	}
	
	//@Test
	void testgetEmployee() {
		Optional<Employee> emp= employeeRepository.findById(17L);
		if(emp.isPresent())
		System.out.println(emp.get());
	}
	
	//@Test
	void testdeleteEmployee() {
		employeeRepository.deleteById(17L);
	}
	
	//@Test
	void testgetAllEmployee() {
		List<Employee> emps= employeeRepository.findAll();
		for(Employee emp : emps)
		System.out.println(emp);
	}
	
	@Test
	void testupdateEmployee() {
		Employee emp = null;
		Optional<Employee> optemp= employeeRepository.findById(17L);
		if(optemp.isPresent()) emp = optemp.get();
		emp.setName("summu");
		emp = employeeRepository.save(emp);
		System.out.println(emp);
	}
}
