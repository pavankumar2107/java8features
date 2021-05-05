package com.java8;

public class HelloWorldLambda {

	public static void main(String[] args) {
		HelloWorldInterface helloWorldInterface = () -> {
			return "hello World";
		};
		System.out.println(helloWorldInterface.sayHelloWorld());

		HelloWorldInterface helloWorldInterfaceWithoutReturn = () -> "hello World";
		System.out.println(helloWorldInterfaceWithoutReturn.sayHelloWorld());
	}

}
