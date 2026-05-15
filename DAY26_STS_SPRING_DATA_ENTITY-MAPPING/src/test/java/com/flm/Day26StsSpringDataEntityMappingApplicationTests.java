package com.flm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flm.entity.Address;
import com.flm.entity.Student;
import com.flm.repository.StudentRepository;

@SpringBootTest
class Day26StsSpringDataEntityMappingApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	void testsaveStudent() {
		Student st = new Student("Santhu", "8396827689");
		Address add1 = new Address("VMR nagar", "vizag", "AndhraPradesh");
		Address add2 = new Address("Chaitanya nagar", "kakinada", "AndhraPradesh");
		st.addAdresses(add1);
		st.addAdresses(add2);
		st = studentRepository.save(st);
		System.out.println(st);
	}

}
