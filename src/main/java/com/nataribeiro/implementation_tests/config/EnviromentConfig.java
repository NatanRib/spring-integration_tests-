package com.nataribeiro.implementation_tests.config;

public class EnviromentConfig {

	private String somePhrase;
	
	public EnviromentConfig (String s) {
		this.somePhrase = s;
	}
	
	public void someMethod() {
		System.out.println(somePhrase);
	}
}

