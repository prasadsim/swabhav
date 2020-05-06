package com.techlabs.model.test;

import java.util.Scanner;

import com.techlabs.model.ConstantsInInterface;

public class ConstantsInInterfaceTest implements ConstantsInInterface {
	public static void main(String[] args) {
		calculateAreaAndCircumference();
		calculateSalary();
	}

	private static void calculateSalary() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Basic Salary:");
		double basicSalary = s.nextDouble();
		double totalSalary = basicSalary * perks * bonus;
		double anualSalary = (totalSalary) * months;
		System.out.println("Anual Salary:" + anualSalary);
	}

	private static void calculateAreaAndCircumference() {
		Scanner s = new Scanner(System.in);
		double areaOfCircle, radiusOfCircle, circumferenceOfCircle;
		System.out.println("\nEnter the Radius of Circle:");
		radiusOfCircle = s.nextDouble();
		areaOfCircle = radiusOfCircle * radiusOfCircle * pie;
		circumferenceOfCircle = 2 * pie * radiusOfCircle;
		System.out.println("Area of Circle:" + areaOfCircle);
		System.out.println("Circumference of Circle:" + circumferenceOfCircle);
	}
}