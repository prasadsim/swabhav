package com.techlabs.model.test;

import java.lang.reflect.*;

import com.techlabs.model.*;

public class FooTest {
	public static void main(String args[]) {
		taskReflection(Foo.class);
	}

	public static void taskReflection(Class reflect) {
		Method[] m = reflect.getDeclaredMethods();
		for (Method methods : m) {
			if (methods.isAnnotationPresent(NeedToRefactor.class)) {
				System.out.println(methods.getName() + " " + NeedToRefactor.value);
			}
		}
	}
}
