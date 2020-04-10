package com.techlabs.model.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.model.Foo;
import com.techlabs.model.UnitTestCase;

public class FooTest {
	public static void main(String[] args)
			throws IllegalAccessException, InvocationTargetException, IllegalArgumentException {
		Foo obj = new Foo();
		getAnnotation(obj.getClass(), obj);
	}

	public static void getAnnotation(Class classname, Object obj)
			throws IllegalAccessException, InvocationTargetException, IllegalArgumentException {
		int totalcount = 0;
		Method[] methods = classname.getDeclaredMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(UnitTestCase.class)) {
				totalcount++;
				if ((boolean) method.invoke(obj)) {
					System.out.println(method.getName() + " is passing testcase");

				} else {
					System.out.println(method.getName() + " is failing testcase");
				}
			} else {
				System.out.println(method.getName() + " is not a testcase");
			}
		}
		System.out.println("Totatl Test Cases:" + totalcount);

	}

}