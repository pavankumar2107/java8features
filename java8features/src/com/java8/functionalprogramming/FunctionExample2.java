package com.java8.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {

	public static void main(String[] args) {

		Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;

		Function<List<Instructor>, Map<String, Integer>> f1 = (instructors -> {
			Map<String, Integer> map = new HashMap<>();
			instructors.forEach(i -> {
				if (p1.test(i)) {
					map.put(i.getName(), i.getYearsOfExperience());
				}
			});
			return map;
		});
		System.out.println(f1.apply(Instructors.getAll()));
	}

}
