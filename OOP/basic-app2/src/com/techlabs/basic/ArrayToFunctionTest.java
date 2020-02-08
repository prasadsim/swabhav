package com.techlabs.basic;

public class ArrayToFunctionTest {
	public static void main(String[] args) {
		double[] CgpaList = { 5.8, 5.9, 6.3, 8.5 };
		upgrade(CgpaList);
		for (double cgpa : CgpaList) {
			System.out.print(cgpa + "\t");
		}
		int a=10;
		upgrade(a);
		System.out.println(a);
	}

	private static void upgrade(double cgpaList[]) {
		for (int i = 0; i < cgpaList.length; i++) {
			cgpaList[i] += cgpaList[i] * 0.1;
		}
	}
	private static void upgrade(int a) {
		a=20;
	}
}
