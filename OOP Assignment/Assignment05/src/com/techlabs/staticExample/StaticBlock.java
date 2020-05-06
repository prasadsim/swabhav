package com.techlabs.staticExample;

public class StaticBlock {
	static int i = 10;
	static {
		System.out.println("Inside Static Block");
		i++;
		System.out.println("Value of I:" + i);

	}

	public static void main(String args[]) {
		System.out.println("\nInside Main Block");
	}
	
	static {
		System.out.println("Bye Static Block");
		
	}
}
