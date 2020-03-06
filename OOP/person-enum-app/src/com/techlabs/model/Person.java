package com.techlabs.model;

public class Person {
	private String name;
	private int age;
	private GenderType gender;
	private float height;
	private float weight;

	public Person(String pname, int page, GenderType pgender, float pheight, float pweight) {
		name = checkName(pname);
		age = checkAge(page);
		gender = pgender;
		height = checkHeightOrWeight(pheight);
		weight = checkHeightOrWeight(pweight);
	}

	private String checkName(String pname) {
		if (pname == null) {
			return "Unknown";
		}
		return pname;
	}

	private int checkAge(int page) {
		if (page < 0) {
			page = 1;
			return page;
		}
		return page;
	}

	private float checkHeightOrWeight(float value) {
		if (value < 0) {
			value = 1;
			return value;
		}
		return value;
	}

	public void doWorkout() {
		weight = weight - 0.02f * weight;
	}

	public void doEat() {
		weight = weight + 0.05f * weight;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderType getGender() {
		return gender;
	}
}
