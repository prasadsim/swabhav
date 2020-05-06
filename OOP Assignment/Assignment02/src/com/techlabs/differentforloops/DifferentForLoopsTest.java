package com.techlabs.differentforloops;

public class DifferentForLoopsTest {
	public static void main(String[] args) {

		String[] names = { "Ash", "Adah", "Rajat", "Skazi", "Vabz" };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println();

		for (int i = names.length - 1; i >= 0; i--) {
			System.out.println(names[i]);
		}

		System.out.println();

		for (String i : names) {
			System.out.println(i);
		}

	}
}
