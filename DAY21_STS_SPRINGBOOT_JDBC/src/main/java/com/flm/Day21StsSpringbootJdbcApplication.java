package com.flm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Day21StsSpringbootJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day21StsSpringbootJdbcApplication.class, args);
	}

}
