package com.flm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findByName(String name);
	List<Employee> findByAddress(String address);
	List<Employee> findByNameAndAddress(String name,String address);
	
	@Query(value = "from Employee")
	List<Employee> getAllEmployees();
	
	@Query(value = "select * from employee", nativeQuery = true)
	List<Employee> getAllEmployeesUsingSql();
	
	@Query(value = "from Employee where salary>= :murty")
	List<Employee> getAllEmployeesBasedOnSalary(@Param("murty")Double salary);
	
	@Query(value = "select *from employee where salary>= :murty", nativeQuery = true)
	List<Employee> getAllEmployeesBasedOnSalaryUsingSql(@Param("murty")Double salary);
}

