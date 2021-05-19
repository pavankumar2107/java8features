package com.java8.functionalprogramming;

import java.util.List;

public class Instructor {
	private String name;
	private int yearsOfExperience;
	private String gender;
	private String title;
	private boolean onlineCourses;
	private List<String> courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isOnlineCourses() {
		return onlineCourses;
	}

	public void setOnlineCourses(boolean onlineCourses) {
		this.onlineCourses = onlineCourses;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Instructor(String name, int yearsOfExperience, String gender, String title, boolean onlineCourses,
			List<String> courses) {
		super();
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
		this.gender = gender;
		this.title = title;
		this.onlineCourses = onlineCourses;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", yearsOfExperience=" + yearsOfExperience + ", gender=" + gender
				+ ", title=" + title + ", onlineCourses=" + onlineCourses + ", courses=" + courses + "]";
	}
}
