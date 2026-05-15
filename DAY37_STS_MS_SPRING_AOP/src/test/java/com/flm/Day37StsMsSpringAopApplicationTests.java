package com.flm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flm.service.EmployeeService;

@SpringBootTest
class Day37StsMsSpringAopApplicationTests {

	@Autowired
	private EmployeeService employeeService;
	
	@Test
	void contextLoads() {
		employeeService.paySalary();
		employeeService.getSalary();
	}

}
