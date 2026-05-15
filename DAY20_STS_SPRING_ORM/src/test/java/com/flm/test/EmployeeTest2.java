package com.flm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flm.dao.EmployeeDao;
import com.flm.entity.Employee;

public class EmployeeTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao dao = ctx.getBean("dao2", EmployeeDao.class);
		
		/*
		Employee emp = new Employee("SaiKiran","Vishakapatanam",9000D);
		dao.saveEmployee(emp);
		System.out.println("Employee is Saved.....");
		
		*/
		
		//dao.deleteEmployee(15L);
		
		/*
		
		Employee emp = dao.getEmployee(14L);
		System.out.println(emp);
		
		*/
		
		/*
		Employee emp = dao.getEmployee(14L);
		System.out.println(emp);
		emp.setName("Sasikiran");
		dao.updateEmployee(emp);
		emp = dao.getEmployee(14L);
		System.out.println(emp);
		*/
		
		for(Employee emp : dao.getAllEmployees())
			System.out.println(emp);
		
	}

}
