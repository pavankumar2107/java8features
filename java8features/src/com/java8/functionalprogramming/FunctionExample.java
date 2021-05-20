package com.java8.functionalprogramming;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer, Double> f1 = i -> Math.sqrt(i);
		System.out.println("sqrt of 25:" + f1.apply(25));

		Function<String, String> f2 = i -> i.toLowerCase();
		System.out.println(f2.apply("PROGRAMMING"));

		Function<String, String> f3 = i -> i.concat(" In  Java");
		System.out.println(f2.andThen(f3).apply("PROGRAMMING"));

		System.out.println(f2.compose(f3).apply("PROGRAMMING"));
	}

}
