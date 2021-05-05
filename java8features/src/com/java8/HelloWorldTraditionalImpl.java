package com.java8;

public class HelloWorldTraditionalImpl implements HelloWorldInterface {

	@Override
	public String sayHelloWorld() {
		return "Hello World";
	}

	public static void main(String[] args) {
		HelloWorldTraditionalImpl helloWorldTraditionalImpl = new HelloWorldTraditionalImpl();
		System.out.println(helloWorldTraditionalImpl.sayHelloWorld());
	}
}
