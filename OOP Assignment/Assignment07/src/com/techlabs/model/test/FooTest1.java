package com.techlabs.model.test;

import java.lang.reflect.*;
import com.techlabs.model.*;

public class FooTest1 {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int testCaseCount = 0;
		int i = 0;
		int passTestCaseCount = 0;
		int failTestCaseCount = 0;
		Foo foo = new Foo();

		Method[] methods = Foo.class.getDeclaredMethods();
		Method[] barCall = new Method[4];

		for (Method method : methods) {

			if (method.isAnnotationPresent(MyBeforeUnitTestCase.class)) {
				barCall[i] = method;
				i++;
			}
			if (method.isAnnotationPresent(UnitTestCase.class)) {
				testCaseCount++;
				if ((boolean) method.invoke(foo)) {
					passTestCaseCount++;
				} else {
					failTestCaseCount++;
				}
				for (Method methodcall : barCall) {
					if (methodcall != null)
						methodcall.invoke(foo);
				}
			}
		}

		System.out.println("\nTotal Test Case:" + testCaseCount);
		System.out.println("Passing Test Case:" + passTestCaseCount);
		System.out.println("Failing Test Case:" + failTestCaseCount);

	}

}
