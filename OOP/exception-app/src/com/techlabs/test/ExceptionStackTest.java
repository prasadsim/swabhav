package com.techlabs.test;

public class ExceptionStackTest {

	public static void main(String[] args) throws Exception {
		try {
			m1();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("End of Main");
	}

	private static void m1() throws Exception {
		m2();
		System.out.println("Inside M1");
	}

	private static void m2() throws Exception {
		m3();
		System.out.println("Inside M2");
	}

	private static void m3() throws Exception {
		System.out.println("Inside M3");
		throw new Exception("Some Fatel Error in M3");
	}
}
