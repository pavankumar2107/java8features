package com.java8.other;

import com.java8.functionalprogramming.Instructor;
import com.java8.functionalprogramming.Instructors;

import java.util.HashMap;
import java.util.Map;

public class CompareHashmap {
    public static void main(String[] args) {


//        Person.java
//        private String firstName;
//        private String lastName;
//setters and getters & constructor

//        String inputCriteriaFirstName = "john";
//
//        Map<String, Person> inputMap = new HashMap<>();
//        Collection<Person> personCollection = inputMap.values();
//        List<Person> personList = new ArrayList<>(personCollection);
//        List<Person> personOutputList = personList.stream()
//                .filter(p -> p.getFirstName().contains(inputCriteriaFirstName ))
//                .collect(Collectors.toList());
//
//
//IS There a BETTER way to DO Below ??
//
//        Set<String> keys = new HashSet<>();
//        for(Person person : personOutputList) {
//            keys.addAll(inputMap.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), person))
//                    .map(Map.Entry::getKey).collect(Collectors.toSet()));
//        }

//        inputMap.entrySet()
//                .stream()
//                .filter(entry -> personOutputList.contains(entry.getValue()))
//                .map(Entry::getKey)
//                .collect(Collectors.toCollection(HashSet::new))


        Map<String, Instructor> instructorMap = new HashMap<>();
        instructorMap.put("1", Instructors.getAll().get(0));
        instructorMap.put("2", Instructors.getAll().get(1));

        Map<String, Instructor> instructorMap2 = new HashMap<>();
        instructorMap2.put("1", Instructors.getAll().get(0));
        instructorMap2.put("3", Instructors.getAll().get(2));


    }
}
