package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLimitAndSkipExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Stream<Integer> limit = numbers.stream().limit(5);
		limit.forEach(System.out::println);
		System.out.println("-------------------");
		Stream<Integer> skip = numbers.stream().skip(5);
		skip.forEach(System.out::println);
	}

}
