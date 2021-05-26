package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Integer res = numbers.stream().reduce(0, Integer::sum);
		System.out.println(res);
		Integer res2 = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(res2);

		List<Integer> numbersList = Arrays.asList();
		Integer res3 = numbersList.stream().reduce(0, (a, b) -> a + b);
		System.out.println(res3);

		Optional<Integer> res4 = numbers.stream().reduce((a, b) -> a + b);
		if (res4.isPresent())
			System.out.println(res4.get());

	}

}
