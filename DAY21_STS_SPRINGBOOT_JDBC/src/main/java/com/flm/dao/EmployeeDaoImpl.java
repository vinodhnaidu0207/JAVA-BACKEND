package com.flm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.flm.model.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao{

	private String INSERT="insert into employee(name,address,salary)values(?,?,?)";
	private String UPDATE="update employee set name=?,address=?,salary=? where id=?";
	private String DELETE="delete from employee where id=?";
	private String GET_ONE="select * from employee where id=?";
	private String GET_ALL="select * from employee";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private RowMapper<Employee> rowMapper;
	
	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void saveEmployee(Employee emp) {
		jdbcTemplate.update(INSERT,emp.getName(),emp.getAddress(),emp.getSalary());
		//throw new RuntimeException();
	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void updateEmployee(Employee emp) {
		jdbcTemplate.update(UPDATE,emp.getName(),emp.getAddress(),emp.getSalary(),emp.getId());
		//throw new RuntimeException();
	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void deleteEmployee(Long id) {
		jdbcTemplate.update(DELETE,id);
		//throw new RuntimeException();
	}

	@Override
	public Employee getEmployee(Long id) {
		List<Employee> emps = jdbcTemplate.query(GET_ONE, rowMapper,id);
		return emps.get(0);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query(GET_ALL, rowMapper);
	}

}
