package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

        List<String> res3 = Optional.of(Instructors.getAll()).orElse(new ArrayList<>()).stream().map(Instructor::getGender).collect(Collectors.toList());
        res3.forEach(System.out::println);



    }

}
