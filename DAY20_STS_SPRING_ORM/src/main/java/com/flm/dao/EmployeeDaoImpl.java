package com.flm.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.flm.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void saveEmployee(Employee emp) {
		hibernateTemplate.save(emp);
	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void updateEmployee(Employee emp) {
		hibernateTemplate.update(emp);
	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void deleteEmployee(Long id) {
		Employee emp = getEmployee(id);
		hibernateTemplate.delete(emp);
	}

	@Override
	public Employee getEmployee(Long id) {
		return hibernateTemplate.get(Employee.class, id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return hibernateTemplate.loadAll(Employee.class);
	}

}
