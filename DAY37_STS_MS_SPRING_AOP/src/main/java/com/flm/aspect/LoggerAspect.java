package com.flm.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class LoggerAspect {
    
	@Before(value = "execution(* com.flm.service.EmployeeService.paySalary(..))")
	public void loggerEvent() {
		log.debug("Employee is paid");
	}
	
	@After(value = "execution(* com.flm.service.EmployeeService.getSalary(..))")
	public void loggerEvent1() {
		log.debug("Employee is paid");
	}
}
