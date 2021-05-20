package com.java8.functionalprogramming;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {

	public static void main(String[] args) {
		Predicate<Instructor> p2 = ConvertToMethodReferenceExample::greaterThanTenYrsOfExp;
		Instructors.getAll().forEach(i -> {
			if (p2.test(i)) {
				System.out.println(i);
			}
		});
	}

	public static boolean greaterThanTenYrsOfExp(Instructor instructor) {
		if (instructor.getYearsOfExperience() > 10)
			return true;
		return false;
	}
}
