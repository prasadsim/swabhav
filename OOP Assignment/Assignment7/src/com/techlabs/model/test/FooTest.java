package com.techlabs.model.test;

import java.lang.reflect.*;

import com.techlabs.model.Foo;
import com.techlabs.model.UnitTestCase;

public class FooTest {
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int testCaseCount = 0;
		int passTestCaseCount = 0;
		int failTestCaseCount = 0;
		Foo foo = new Foo();

		Method[] methods = Foo.class.getDeclaredMethods();

		for (Method m : methods) {
			if (m.isAnnotationPresent(UnitTestCase.class)) {
				testCaseCount++;
				if ((boolean) m.invoke(foo)) {
					System.out.println(m.getName() + " is PassingTestCase");
					passTestCaseCount++;
				} else {
					System.out.println(m.getName() + " is FailingTestCase");
					failTestCaseCount++;
				}
			} else {
				System.out.println(m.getName() + " is not TestCase");
			}
		}
		System.out.println("\nTotal Test Case:" + testCaseCount);
		System.out.println("Passing Test Case:" + passTestCaseCount);
		System.out.println("Failing Test Case:" + failTestCaseCount);
	}
}
