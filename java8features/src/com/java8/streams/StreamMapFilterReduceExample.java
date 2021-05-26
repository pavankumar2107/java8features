package com.java8.streams;

import java.util.Optional;

import com.java8.functionalprogramming.Instructor;
import com.java8.functionalprogramming.Instructors;

public class StreamMapFilterReduceExample {

	public static void main(String[] args) {
		Optional<Integer> res = Instructors.getAll().stream().map(Instructor::getYearsOfExperience)
				.reduce((a, b) -> a + b);
		if (res.isPresent())
			System.out.println(res.get());

		Optional<Integer> res2 = Instructors.getAll().stream().filter(Instructor::isOnlineCourses)
				.map(Instructor::getYearsOfExperience).reduce(Integer::sum);
		if (res2.isPresent())
			System.out.println(res2.get());
		Optional<Integer> res3 = Instructors.getAll().stream().filter(i -> i.isOnlineCourses() == false)
				.map(Instructor::getYearsOfExperience).reduce(Integer::sum);
		if (res3.isPresent())
			System.out.println(res3.get());
	}

}
