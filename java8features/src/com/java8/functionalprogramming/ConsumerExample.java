package com.java8.functionalprogramming;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (str) -> System.out.println(str.length() + " The value of str:" + str);
		consumer.accept("pavan");

		// consumer with block statement

		Consumer<Integer> consumer2 = (i) -> {
			System.out.println("i*i:" + i * i);
			System.out.println("i+i:" + (i + i));
		};
		consumer2.accept(10);
	}
}
