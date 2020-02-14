package com.techlabs.modifyarray;

public class ArrayUsingForLoopEachTest {
	public static void main(String[] args) {
		int[] arr = { 1001, 1002, 1003, 1004, 1005 };
		for (int t : arr) {
			t = t + 1000;
			System.out.println(t);
		}
	}
}
