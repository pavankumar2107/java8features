package com.java8.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();
		BiPredicate<Boolean, Integer> p3 = (online, exp) -> online == true && exp > 10;
		BiConsumer<String, List<String>> biConsumer2 = (name, courses) -> System.out
				.println("name:" + name + " courses:" + courses);

		instructors.forEach(i -> {
			if (p3.test(i.isOnlineCourses(), i.getYearsOfExperience())) {
				biConsumer2.accept(i.getName(), i.getCourses());
			}
		});

	}

}
