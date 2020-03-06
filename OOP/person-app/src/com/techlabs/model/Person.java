package com.techlabs.model;

public class Person {
	private String name;
	private int age;
	private String gender;
	private float height;
	private float weight;

	public Person(String pname, int page, String pgender, float pheight, float pweight) {
		name = checkName(pname);
		age = checkAge(page);
		gender = checkGender(pgender);
		height = checkHeightOrWeight(pheight);
		weight = checkHeightOrWeight(pweight);
	}

	public float calculateBmi() {
		float newheight = 0.3048f * height;
		float bmi = weight / (newheight * newheight);
		return bmi;
	}

	public String bmiCategory() {
		float newheight = 0.3048f * height;
		float bmi = weight / (newheight * newheight);

		if (bmi < 15) {
			return "Very severely underweight";
		} else if (bmi >= 15 && bmi < 16) {
			return "Severely underweight";
		} else if (bmi >= 16 && bmi < 18.5) {
			return "Underweight";
		} else if (bmi >= 18.5 && bmi < 25) {
			return "Normal";
		} else if (bmi >= 25 && bmi < 30) {
			return "Overweight";
		} else if (bmi >= 30 && bmi < 35) {
			return "Moderately obese";
		} else if (bmi >= 35 && bmi < 40) {
			return "Severely obese";
		}
		return "very severely obese";

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

	private String checkGender(String pgender) {
		if (pgender.equalsIgnoreCase("MALE") || pgender.equalsIgnoreCase("FEMALE")) {
			return pgender;
		}
		return "OTHER";
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

	public String getGender() {
		return gender;
	}
}
