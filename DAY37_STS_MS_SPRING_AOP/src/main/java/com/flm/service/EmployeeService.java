package com.flm.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {

	public void paySalary() {
		log.debug("Employee is paid in pay salary method");
	}
	
	public void getSalary() {
		log.debug("Employee is paid in get salary method");
	}
}
