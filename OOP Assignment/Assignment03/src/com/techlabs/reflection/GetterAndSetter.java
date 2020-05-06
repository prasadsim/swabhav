package com.techlabs.reflection;

import java.lang.reflect.Method;

public class GetterAndSetter {
	public static void main(String[] args) {
		Class<?> reflectionClassForSystem = System.class;
		Class<?> reflectionClassForString = String.class;
		Class<?> reflectionClassForObject = Object.class;

		int getSystem = 0, setSystem = 0, getString = 0, setString = 0, getObject = 0, setObject = 0;
		String classNameForSystem = reflectionClassForSystem.getName();
		System.out.println("Name of class is : " + classNameForSystem);

		String classNameForString = reflectionClassForString.getName();
		System.out.println("Name of class is : " + classNameForString);

		String classNameForObject = reflectionClassForObject.getName();
		System.out.println("Name of class is : " + classNameForObject);

		Method[] classMethodsForSystem = reflectionClassForSystem.getMethods();
		for (Method a : classMethodsForSystem) {
			if (a.getName().startsWith("get")) {
				getSystem++;
			} else if (a.getName().startsWith("set")) {
				setSystem++;
			}
		}
		Method[] classMethodsForString = reflectionClassForString.getMethods();
		for (Method a : classMethodsForString) {
			if (a.getName().startsWith("get")) {
				getString++;
			} else if (a.getName().startsWith("set")) {
				setString++;
			}
		}
		Method[] classMethodsForObject = reflectionClassForObject.getMethods();
		for (Method a : classMethodsForObject) {
			if (a.getName().startsWith("get")) {
				getObject++;
			} else if (a.getName().startsWith("set")) {
				setObject++;
			}
		}

		System.out.println("System Class \tList of Methods are get:" + getSystem + "\tset:" + setSystem);
		System.out.println("String Class \tList of Methods are get:" + getString + "\tset:" + setString);
		System.out.println("Object Class \tList of Methods are get:" + getObject + "\tset:" + setObject);

	}
}
