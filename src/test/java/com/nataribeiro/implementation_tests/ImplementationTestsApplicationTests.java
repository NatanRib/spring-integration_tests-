package com.nataribeiro.implementation_tests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nataribeiro.implementation_tests.services.SomeService;

@SpringBootTest
class ImplementationTestsApplicationTests {

	@Autowired
	SomeService service;
	
	@Test
	void contextLoads() {
		service.someMethod();
	}

}
