package com.techlabs.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

class Test {
	// creating a private field
	private String s;

	// creating a public constructor
	public Test() {
		s = "GeeksforGeeks";
	}

	// Creating a public method with no arguments
	public void method1() {
		System.out.println("The string is " + s);
	}

	// Creating a public method with int as argument
	public void method2(int n) {
		System.out.println("The number is " + n);
	}

}

public class ReflectionTest {
	public static void main(String args[]) throws Exception {
		Test obj = new Test();
		Class<?> cls = obj.getClass();
		System.out.println("The name of class is " + cls.getName());

		Constructor<?> constructor = cls.getConstructor();
		System.out.println("The name of constructor is " + constructor.getName());

		System.out.println("The public methods of class are : ");

		Method[] methods = cls.getMethods();

		for (Method method : methods) {
			System.out.println(method.getName());
			if (method.getName().startsWith("get")) {
				System.out.println(method+" method type is getter");
			} else if (method.getName().startsWith("set")) {
				System.out.println(method.+" Method is setter");
			}
		}
	}
}
