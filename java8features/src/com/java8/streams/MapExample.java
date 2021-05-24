package com.java8.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.functionalprogramming.Instructor;
import com.java8.functionalprogramming.Instructors;

public class MapExample {

	public static void main(String[] args) {
		List<Instructor> list = Instructors.getAll();
		List<String> instructorsNames = list.stream().map(Instructor::getName).map(String::toUpperCase)
				.collect(Collectors.toList());
		Set<String> instructorsNames2 = list.stream().map(i -> i.getName()).collect(Collectors.toSet());
		System.out.println(instructorsNames);
		System.out.println(instructorsNames2);
	}

}
