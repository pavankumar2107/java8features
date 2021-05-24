package com.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.functionalprogramming.Instructor;
import com.java8.functionalprogramming.Instructors;

public class StreamsOperations {

	public static void main(String[] args) {
		long count = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).count();
		System.out.println(count);
		long count2 = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).distinct()
				.count();
		System.out.println(count2);
		List<String> courses = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream)
				.distinct().sorted().collect(Collectors.toList());
		System.out.println(courses);

		boolean anyMatch = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream)
				.anyMatch(s -> s.startsWith("J"));

		System.out.println(anyMatch);

		boolean allMatch = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream)
				.allMatch(s -> s.startsWith("J"));

		System.out.println(allMatch);

		boolean noneMatch = Instructors.getAll().stream().map(Instructor::getCourses).flatMap(List::stream)
				.noneMatch(s -> s.startsWith("I"));

		System.out.println(noneMatch);
	}

}
