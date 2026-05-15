package com.flm;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flm.entity.Employee;
import com.flm.repository.EmployeeRepository;

@SpringBootTest
class Day25StsSpringDataWebCrudQueryApplicationTests {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//@Test
	void testsaveEmployee() {
		Employee emp = new Employee("koushik", "vizag", 13000D);
		emp=employeeRepository.save(emp);
		System.out.println(emp);
	}
	
	
	@Test
	void testfindByName() {
		List<Employee> emp = employeeRepository.getAllEmployeesBasedOnSalaryUsingSql(10000D);
		for(Employee emps : emp)
			System.out.println(emp);
	}
	
	
}
