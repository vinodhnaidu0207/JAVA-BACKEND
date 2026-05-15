package com.flm.dao;

import java.util.List;

import com.flm.model.Employee;

public interface EmployeeDao {
	void saveEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(Long id);
	Employee getEmployee(Long id);
	List<Employee>getAllEmployees();
}
