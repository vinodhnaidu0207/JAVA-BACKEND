package com.flm;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flm.dao.EmployeeDao;
import com.flm.model.Employee;

@SpringBootTest
class Day21StsSpringbootJdbcApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;
	
	//@Test
	void testsaveEmployee() {
		Employee emp = new Employee("Bharat", "Shiridi", 11000D);
		employeeDao.saveEmployee(emp);
		System.out.println("Employee is Saved...");
	}

	//@Test
	void testgetEmployee() {
		Employee emp = employeeDao.getEmployee(1L);
		System.out.println(emp);
	}
	
	//@Test
	void testgetAllEmployees() {
		List<Employee> emps = employeeDao.getAllEmployees();
		System.out.println(emps);
	}
	
	//@Test
	void testupdateEmployee() {
		Employee emp = employeeDao.getEmployee(1L);
		System.out.println(emp);
		emp.setSalary(6000D);
		employeeDao.updateEmployee(emp);
		emp = employeeDao.getEmployee(1L);
		System.out.println(emp);
	}
	
	@Test
	void testdeleteEmployee() {
		employeeDao.deleteEmployee(16L);
		System.out.println("employee is Deleted....");
	}
}
