package com.techlabs.test;

public class BugTest {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("Value:" + c);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Exception");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormat Exception");
		} catch (Exception e) {
			System.out.println("Exception arise");
		}
		System.out.println("End of main");
	}

}
