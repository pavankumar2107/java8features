package com.java8.functionalprogramming;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {

		UnaryOperator<Integer> u = i -> i * 10;
		System.out.println(u.apply(100));

		Function<Integer, Integer> f = i -> i * 10;
		System.out.println(f.apply(100));

		IntUnaryOperator intUnaryOperator = i -> i * 100;
		System.out.println(intUnaryOperator.applyAsInt(10));

		LongUnaryOperator longUnaryOperator = i -> i * 1000l;
		System.out.println(longUnaryOperator.applyAsLong(100L));

		DoubleUnaryOperator doubleUnaryOperator = i -> i * 100.0;
		System.out.println(doubleUnaryOperator.applyAsDouble(100.0));
	}

}
