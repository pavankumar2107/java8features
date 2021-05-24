package com.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.functionalprogramming.Instructor;
import com.java8.functionalprogramming.Instructors;

public class StreamExample {

	public static void main(String[] args) {

		Predicate<Instructor> p1 = i -> i.isOnlineCourses();
		Predicate<Instructor> p2 = i -> i.getYearsOfExperience() > 10;

		List<Instructor> list = Instructors.getAll();
		Map<String, List<String>> result = list.stream().filter(p1).filter(p2)
				.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		System.out.println(result);

		Map<String, List<String>> map = list.stream().filter(p1.and(p2))
				.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		System.out.println(map);

		Map<String, List<String>> m = list.stream().filter(i -> i.isOnlineCourses() && i.getYearsOfExperience() > 10)
				.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		System.out.println(m);

	}

}
