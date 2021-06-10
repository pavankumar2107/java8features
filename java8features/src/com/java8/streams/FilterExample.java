package com.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.functionalprogramming.Instructor;
import com.java8.functionalprogramming.Instructors;

public class FilterExample {

	public static void main(String[] args) {
		List<Instructor> list = Instructors.getAll().stream().filter(e -> e.getYearsOfExperience() > 10)
				.sorted(Comparator.comparing(Instructor::getName)).collect(Collectors.toList());
		
		System.out.println(list);
	}

}
