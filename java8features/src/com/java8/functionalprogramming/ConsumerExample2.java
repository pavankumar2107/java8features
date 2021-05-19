package com.java8.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

	public static void main(String[] args) {
		List<Instructor> instrctors = Instructors.getAll();

		Consumer<Instructor> c1 = (instructor) -> System.out.println(instructor);
		instrctors.forEach(c1);
		System.out.println("---------------------------------------");
		Consumer<Instructor> c2 = (instructor) -> System.out.println(instructor.getName());
		instrctors.forEach(c2);

		System.out.println("---------------------------------------");
		Consumer<Instructor> c3 = (instructor) -> System.out.println(instructor.getCourses());
		instrctors.forEach(c2.andThen(c3));

		System.out.println("---------------------------------------");
		Consumer<Instructor> c4 = (instructor) -> {
			if (instructor.getYearsOfExperience() > 10) {
				System.out.println(instructor);
			}
		};
		instrctors.forEach(c4);

		instrctors.forEach(instructor -> {
			if (instructor.getYearsOfExperience() > 10) {
				c1.accept(instructor);
			}
		});
		System.out.println("------------------------------------------------");
		instrctors.forEach(instructor -> {
			if (instructor.getYearsOfExperience() > 5 && !instructor.isOnlineCourses()) {
				c1.andThen(c2).accept(instructor);
			}
		});

	}

}
