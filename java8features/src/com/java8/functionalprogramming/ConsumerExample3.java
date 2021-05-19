package com.java8.functionalprogramming;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample3 {

	public static void main(String[] args) {

		IntConsumer intConsumer = (s1) -> System.out.println(s1 * s1);
		intConsumer.accept(10);

		LongConsumer longConsumer = (s1) -> System.out.println(s1 * s1);
		longConsumer.accept(10L);

		DoubleConsumer doubleConsumer = (s1) -> System.out.println(s1 * s1);
		doubleConsumer.accept(10.0);
	}

}
