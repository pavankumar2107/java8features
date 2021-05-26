package com.java8.streams;

import java.util.Optional;

import com.java8.functionalprogramming.Instructor;
import com.java8.functionalprogramming.Instructors;

public class StreamFindFirstAndAnyExample {

	public static void main(String[] args) {
		Optional<Instructor> res = Instructors.getAll().stream().findFirst();
		if (res.isPresent())
			System.out.println(res.get());

		Optional<Instructor> res2 = Instructors.getAll().stream().findAny();
		if (res2.isPresent())
			System.out.println(res2.get());
	}

}
