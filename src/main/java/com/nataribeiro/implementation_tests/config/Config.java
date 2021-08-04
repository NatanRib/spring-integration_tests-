package com.nataribeiro.implementation_tests.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

	@Profile("test")
	@Bean
	public EnviromentConfig forTest() {
		return new EnviromentConfig("I am test");
	}
	
	@Profile("!test")
	@Bean
	public EnviromentConfig forProduction() {
		return new EnviromentConfig("I am production");
	}
}
