package com.flm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@PropertySource(value= {"users.properties"})
public class MyBeans {

	@Value("${user1.name}")
	private String firstUserName;
	
	@Value("${user1.password}")
	private String firstUserPassword;
	
	@Value("${user2.name}")
	private String secondUserName;
	
	@Value("${user2.password}")
	private String secondUserPassword;
	
	@Value("${user3.name}")
	private String thirdUserName;
	
	@Value("${user3.password}")
	private String thirdUserPassword;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user1 = User.builder()
				.username(firstUserName)
				.password(passwordEncoder().encode(firstUserPassword))
				.build();
		UserDetails user2 = User.builder()
				.username(secondUserName)
				.password(passwordEncoder().encode(secondUserPassword))
				.build();
		UserDetails user3 = User.builder()
				.username(thirdUserName)
				.password(passwordEncoder().encode(thirdUserPassword))
				.build();
		return new InMemoryUserDetailsManager(user1,user2,user3);
	}
}
