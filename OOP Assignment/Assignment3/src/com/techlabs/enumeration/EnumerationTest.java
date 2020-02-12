package com.techlabs.enumeration;

import java.util.Arrays;

public class EnumerationTest {
	public enum seasons {
		Spring, Summer, Monsoon, Autumn, Winter
	}

	public static void main(String[] args) {
		System.out.println("Enum Values\n");
		Arrays.asList(seasons.values()).forEach(season -> System.out.println(season));
	}
}