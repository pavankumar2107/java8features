package com.java8.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {

	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();
		Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;

		Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;
		BiConsumer<String, List<String>> biConsumer2 = (name, courses) -> System.out
				.println("name:" + name + " courses:" + courses);

		instructors.forEach(i -> {
			if (p1.and(p2).test(i)) {
				biConsumer2.accept(i.getName(), i.getCourses());
			}
		});

	}

}
