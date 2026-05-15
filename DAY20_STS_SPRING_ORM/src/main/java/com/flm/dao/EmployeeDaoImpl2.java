package com.flm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.flm.entity.Employee;

@Component(value = "dao2")
public class EmployeeDaoImpl2 extends HibernateDaoSupport implements EmployeeDao{
	
	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void saveEmployee(Employee emp) {
		getHibernateTemplate().save(emp);
	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void updateEmployee(Employee emp) {
		getHibernateTemplate().update(emp);
	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void deleteEmployee(Long id) {
		Employee emp = getEmployee(id);
		getHibernateTemplate().delete(emp);
	}

	@Override
	public Employee getEmployee(Long id) {
		return getHibernateTemplate().get(Employee.class, id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return getHibernateTemplate().loadAll(Employee.class);
	}

}
