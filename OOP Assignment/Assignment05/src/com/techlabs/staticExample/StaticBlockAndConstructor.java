package com.techlabs.staticExample;

class A {
	static int i; //Static value
	int a = 10; //Instance value

	public static void increment() {
		i=10;
		int a=10;
		i = i + 5;
	}

	A() {
		System.out.println("Inside constructor a:"+a);
		i++;
		System.out.println("Inside Constructor of different class"); // this block only executed after the object of
																		// this class is created;
		System.out.println("Value of I:" + i);
	}
}

public class StaticBlockAndConstructor {
	static {
		System.out.println("Inside Static Block"); // This static block will execute very first before main;
	}

	public static void main(String args[]) {
		A a = new A();
		A.i++;
		System.out.println("Inside main I:" + A.i);
		System.out.println("Inside Main");
		
		a.a = 20;
		System.out.println("Main:" + a.a);

		A.i++;
		System.out.println("Inside main I:" + A.i);
		A.increment();
		System.out.println("After Increment:" + A.i);
	}

	static {
		System.out.println("Bye Static Block");
	}

}
