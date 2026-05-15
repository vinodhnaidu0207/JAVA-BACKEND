package com.flm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Day32StsMsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day32StsMsConfigServerApplication.class, args);
	}

}
