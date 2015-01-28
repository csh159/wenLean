package com.csh.spring.learn;

public class HelloImpl implements HelloApi {

	@Override
	public void sayHello() {
		System.out.println("hello world!");
	}

	@Override
	public void sayName() {
		System.out.println("hello name");
		
	}

}
