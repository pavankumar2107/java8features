package com.java8.functionalprogramming;

import java.util.List;

public interface InstructorFactory {
	public abstract Instructor getInstructor(String name, int yearsOfExperience, String gender, String title,
			boolean onlineCourses, List<String> courses);
}
