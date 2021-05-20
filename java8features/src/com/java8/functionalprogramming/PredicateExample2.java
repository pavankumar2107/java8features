package com.java8.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();
		Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;

		Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;

		instructors.forEach(i -> {
			if (p1.test(i)) {
				System.out.println(i);
			}
		});
		System.out.println("------------------------------");
		instructors.forEach(i -> {
			if (p2.test(i)) {
				System.out.println(i);
			}
		});

		System.out.println("------------------------------");
		instructors.forEach(i -> {
			if (p1.and(p2).test(i)) {
				System.out.println(i);
			}
		});
	}

}
