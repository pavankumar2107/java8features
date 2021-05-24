package com.java8.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.functionalprogramming.Instructor;
import com.java8.functionalprogramming.Instructors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<Instructor> list = Instructors.getAll();
		// List<String> instructorCourses =
		// list.stream().map(Instructor::getCourses).collect(Collectors.toList());
		// here we use flatMap for .....
		Set<String> instructorCourses = list.stream().map(Instructor::getCourses).flatMap(List::stream)
				.collect(Collectors.toSet());
		System.out.println(instructorCourses);
	}

}
