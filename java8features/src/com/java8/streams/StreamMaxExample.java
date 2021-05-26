package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Optional<Integer> res = numbers.stream().max(Integer::compareTo);
		if (res.isPresent())
			System.out.println(res.get());
		Integer res2 = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		Optional<Integer> res3 = numbers.stream().reduce((a, b) -> a > b ? a : b);
		if (res3.isPresent())
			System.out.println(res3.get());
		Optional<Integer> res4 = numbers.stream().reduce(Integer::max);
		if (res4.isPresent())
			System.out.println(res4.get());
	}

}
