package com.java8.functionalprogramming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {

	public static void main(String[] args) {
		IntPredicate p1 = i -> i > 100;
		System.out.println(p1.test(1000));
		LongPredicate p2 = i -> i > 100L;
		System.out.println(p2.test(10000L));
		DoublePredicate p3 = i -> i > 100.0;
		System.out.println(p3.test(50.0));
	}

}
