package com.techlabs.objectcalisthenics;

public class ObjectCalisthenicsRule2 {
	public static void main(String[] args) {
		withRule2(8);
		System.out.println();
		withOutRule2(81);
	}

	private static void withRule2(int num) {
		if (num % 2 == 0) {
			System.out.println("Number is Even:" + num);
			return;
		}
	}

	private static void withOutRule2(int num) {
		if (num % 2 == 0) {
			System.out.println("Number is Even:" + num);
		} else {
			System.out.println("Number is Odd:" + num);
		}
	}
}
