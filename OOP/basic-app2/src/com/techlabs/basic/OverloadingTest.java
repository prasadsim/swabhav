package com.techlabs.basic;

public class OverloadingTest {
	public static void main(String args[]) {
	/*	System.out.println("Welcome to basic Java Project");
		System.out.println("hello");
		System.out.println(200005);
		System.out.println(true);
		System.out.println(0);
		System.out.println(2.0005);
		System.out.println('a');
		*/
		
		printInfo("Hello");
		printInfo(5000012);
		printInfo(5.24f);
		printInfo(true);
		printInfo('#');
	}
		
		private static void printInfo(String str) {
			System.out.println(str);
		}
		private static void printInfo(double d) {
			System.out.println(d);
		}
		public static void printInfo(float f) {
			System.out.println(f);
		}
		public static void printInfo(boolean b) {
			System.out.println(b);
		}
		public static void printInfo(char c) {
			System.out.println(c);
		}
		
		
}
