package com.java8.functionalprogramming;

import java.util.function.IntConsumer;

public class VariableScope {
	static int k = 0;

	public static void main(String[] args) {
		int a = 10;// local variable,
		IntConsumer intConsumer = i -> System.out.println(i);

		Instructors.getAll().forEach(instrctor -> {
			System.out.println(instrctor + "  " + k++);
		});
		// k=6;
		k++;
	}

}
