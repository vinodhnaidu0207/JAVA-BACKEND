package com.flm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Day30StsMsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day30StsMsServiceRegistryApplication.class, args);
	}

}
