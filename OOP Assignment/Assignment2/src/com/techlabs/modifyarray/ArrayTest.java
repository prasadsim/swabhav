package com.techlabs.modifyarray;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = { 1001, 1002, 1003, 1004, 1005 };
		int ping = 3;
		for (int i = 0; i < arr.length; i++) {
			if (ping == i) {
				arr[i] = 101010;
			}
			System.out.println(arr[i]);
		}
	}
}
