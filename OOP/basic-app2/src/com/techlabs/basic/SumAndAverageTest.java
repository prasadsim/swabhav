package com.techlabs.basic;

public class SumAndAverageTest {
	public static void main(String inputs[]) {
		if (inputs.length == 0) {
			System.out.println("no arguments");
//			System.exit(0);
			return;
		}
		
//		for (int i = inputs.length; i > 0; i--) {
			if (inputs[inputs.length] == "-even") {
				calculateEven(inputs);
			} else if (inputs[inputs.length] == "-odd") {
				calculateOdd(inputs);
			} else {
				calculateSumAndAverage(inputs);
			}
//		}
		
	}

	private static int[] convertToInt(String input[]) {
		int[] numbers = new int[input.length - 1];
		for (int i = 0; i < input.length - 1; i++) {

			System.out.print(input[i] + "\t");

			numbers[i] = Integer.parseInt(input[i]);

		}
		return numbers;
	}

	private static void calculateEven(String inputs[]) {
		int[] numbers = convertToInt(inputs);
		int sumOfEven = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			System.out.println(numbers[i] + "\t");
			if (numbers[i] % 2 == 0) {
				sumOfEven += numbers[i];
			}
		}
		int avgOfEven = sumOfEven / numbers.length;
		System.out.println("Summation of Even:" + sumOfEven + "\tAverage of Even:" + avgOfEven);

	}

	private static void calculateOdd(String inputs[]) {
		int[] numbers = convertToInt(inputs);
		int sumOfOdd = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			System.out.println(numbers[i] + "\t");
			if (numbers[i] % 2 != 0) {
				sumOfOdd += numbers[i];
			}
		}
		int avgOfOdd = sumOfOdd / numbers.length;
		System.out.println("Summation of Odd:" + sumOfOdd + "\tAverage of Odd:" + avgOfOdd);
	}

	private static void calculateSumAndAverage(String inputs[]) {

		int[] numbers = convertToInt(inputs);
		System.out.println();

		int average, summation = 0;
		for (int i = 0; i < numbers.length; i++) {
			summation += numbers[i];
		}

		average = summation / numbers.length;
		System.out.println("Summation:" + summation + "\tAverage:" + average);
	}
}