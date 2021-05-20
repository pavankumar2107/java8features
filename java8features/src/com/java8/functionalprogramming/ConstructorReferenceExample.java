package com.java8.functionalprogramming;

import java.util.Arrays;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		InstructorFactory instructorFactory = Instructor::new;
		Instructor instructor = instructorFactory.getInstructor("Mike", 10, "M", "Software Developer", true,
				Arrays.asList("Java programing", "C++ programming", "Python programming"));
		System.out.println(instructor);
	}

}
