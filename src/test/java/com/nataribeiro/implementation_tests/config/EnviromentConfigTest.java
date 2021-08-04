package com.nataribeiro.implementation_tests.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class EnviromentConfigTest {

	@Autowired
	EnviromentConfig env;
	
	@Test
	void test() {
		env.someMethod();
	}

}
