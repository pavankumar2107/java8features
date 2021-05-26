package com.java8.streams;

import java.util.Optional;

import com.java8.functionalprogramming.Instructor;
import com.java8.functionalprogramming.Instructors;

public class ReduceExample2 {

	public static void main(String[] args) {
		Optional<Instructor> res = Instructors.getAll().stream().reduce((s1, s2) -> {
			if (s1.getYearsOfExperience() > s2.getYearsOfExperience())
				return s1;
			else
				return s2;
		});
		if (res.isPresent())
			System.out.println(res.get());

		Optional<Instructor> res2 = Instructors.getAll().stream()
				.reduce((s1, s2) -> s1.getYearsOfExperience() > s2.getYearsOfExperience() ? s1 : s2);
		if (res2.isPresent())
			System.out.println(res2.get());
	}

}
