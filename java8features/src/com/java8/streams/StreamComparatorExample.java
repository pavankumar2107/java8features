package com.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.functionalprogramming.Instructor;
import com.java8.functionalprogramming.Instructors;

public class StreamComparatorExample {

	public static void main(String[] args) {
		List<Instructor> names = Instructors.getAll().stream().sorted(Comparator.comparing(Instructor::getName))
				.collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println("-------------------------");
		List<Instructor> names1 = Instructors.getAll().stream()
				.sorted(Comparator.comparing(Instructor::getName).reversed()).collect(Collectors.toList());
		names1.forEach(System.out::println);
	}

}
