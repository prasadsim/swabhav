package com.techlabs.objectcalisthenics;

public class ObjectCalisthenicsRule1 {
	public static void main(String[] args) {
		withRule1();
		System.out.println();
		System.out.println();
		withOutRule2();
	}

	private static void withRule1() {// Since there is indentation the code become complex to read

		int[][] TwoDArray = new int[10][10];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				TwoDArray[i][j] = j;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(TwoDArray[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void withOutRule2() { // Since there is no indentation the code become complex to read
		char[][] TwoDArray2 = new char[10][10];
		for (int i = 0; i < 5; i++) {
		for (int j = i; j < 5; j++) {
		TwoDArray2[i][j] = '*';
		}
		}

		for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
		System.out.print(TwoDArray2[i][j] + "\t");
		}
		System.out.println();

		}
	}
}
