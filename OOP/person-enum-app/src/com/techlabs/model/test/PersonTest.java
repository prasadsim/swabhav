package com.techlabs.model.test;

import com.techlabs.model.Person;
import com.techlabs.model.GenderType;

public class PersonTest {
	public static void main(String agrs[]) {
		Person p1 = new Person("ASH", 50, GenderType.MALE, 6.5f, 100f);
		printInfo(p1);
		p1.doWorkout();
		System.out.println("After workout:" + p1.getWeight());
		p1.doEat();
		System.out.println("After Eatting:" + p1.getWeight() + "\n");

		Person p2 = new Person(null, -50, GenderType.FEMALE, -6.5f, -100f);
		printInfo(p2);
		p2.doWorkout();
		System.out.println("After workout:" + p2.getWeight());
		p2.doEat();
		System.out.println("After Eatting:" + p2.getWeight() + "\n");
	}

	private static void printInfo(Person p) {
		System.out.println("Name:" + p.getName());
		System.out.println("AGE:" + p.getAge());
		System.out.println("Gender:" + p.getGender());
		System.out.println("Height:" + p.getHeight());
		System.out.println("Weight:" + p.getWeight());
	}
}
