package com.java8.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {
	public static List<Instructor> getAll() {
		Instructor instructor1 = new Instructor("Mike", 10, "M", "Software Developer", true,
				Arrays.asList("Java programing", "C++ programming", "Python programming"));
		Instructor instructor2 = new Instructor("Johny", 5, "F", "Engineer", false,
				Arrays.asList("Multi-Threaded programing", "CI/CD", "Unit Testing"));
		Instructor instructor3 = new Instructor("Gene", 6, "M", "Manager", false,
				Arrays.asList("C programming", "C++ programming", "React Native"));
		Instructor instructor4 = new Instructor("Anthony", 15, "M", "Senier Developer", true,
				Arrays.asList("Java programing", "Angular programing", "React Native"));
		Instructor instructor5 = new Instructor("Syed", 15, "M", "Principal Engineer", true,
				Arrays.asList("Java programing", "Java Multi-Threaded programing", "React Native"));
		return Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5);
	}
}
