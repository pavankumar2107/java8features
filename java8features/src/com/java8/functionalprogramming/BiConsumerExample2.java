package com.java8.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {

	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();

		BiConsumer<String, String> biConsumer = (name, gender) -> System.out
				.println("name:" + name + " gender:" + gender);
		instructors.forEach(i -> {
			biConsumer.accept(i.getName(), i.getGender());
		});

		BiConsumer<String, List<String>> biConsumer2 = (name, courses) -> System.out
				.println("name:" + name + " courses:" + courses);
		instructors.forEach(i -> {
			biConsumer2.accept(i.getName(), i.getCourses());
		});

		instructors.forEach(i -> {
			if (i.isOnlineCourses()) {
				biConsumer.accept(i.getName(), i.getGender());
			}
		});
	}

}
