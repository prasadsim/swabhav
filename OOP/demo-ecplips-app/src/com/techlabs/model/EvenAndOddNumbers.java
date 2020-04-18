package com.techlabs.model;

public class EvenAndOddNumbers {
	private int number = 100;
	private int[] evenNumber = new int[50];
	private int[] oddNumber = new int[50];

	public int[] getEvenNumbers() {
		int index = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				evenNumber[index] = i;
				index++;
			}
		}
		return evenNumber;
	}

	public int[] getOddNumbers() {
		int index = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 1) {
				oddNumber[index] = i;
				index++;
			}
		}
		return oddNumber;
	}
}
