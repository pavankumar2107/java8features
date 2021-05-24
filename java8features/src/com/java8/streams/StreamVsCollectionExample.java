package com.java8.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("mike");
		names.add("syed");
		names.add("Rajeev");
		System.out.println("----------------------");
		System.out.println(names);
		names.remove("syed");
		System.out.println(names);

		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("----------------------");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("----------------------");
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("----------------------");
		Stream<String> namesStream = names.stream();
		// namesStream.forEach(System.out::println);
		// namesStream.forEach(System.out::println); gives error

		List<String> l = names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
		System.out.println(l);
	}

}
