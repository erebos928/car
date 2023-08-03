package com.carbusiness.car.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		UserDetails userDetails = User
				.builder()
				.passwordEncoder(input -> passwordEncoder().encode(input))
			.username("amir")
			.password("123123")
			.roles("USER","ADMIN")
			.build();
		return new InMemoryUserDetailsManager(userDetails);
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}