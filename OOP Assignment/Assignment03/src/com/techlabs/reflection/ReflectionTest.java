package com.techlabs.reflection;

import java.lang.reflect.*;

public class ReflectionTest {

	public static void main(String args[]) {
		Class classNameForSystem = null;
		Class classNameForString = null;
		Class classNameForObject = null;

		try {
			classNameForSystem = Class.forName("java.lang.System");
			classNameForString = Class.forName("java.lang.String");
			classNameForObject = Class.forName("java.lang.Object");

			Method[] methodsForSystemClass = classNameForSystem.getMethods();
			Method[] methodsForStringClass = classNameForString.getMethods();
			Method[] methodsForObjectClass = classNameForObject.getMethods();

			Constructor[] constructorForSystem = classNameForSystem.getConstructors();
			Constructor[] constructorForString = classNameForString.getConstructors();
			Constructor[] constructorForObject = classNameForObject.getConstructors();

			System.out.println("Methods From System Class:" + methodsForSystemClass.length);
			System.out.println("Methods From String Class:" + methodsForStringClass.length);
			System.out.println("Methods From Object Class:" + methodsForObjectClass.length);

			System.out.println();

			System.out.println("Constructors From System Class:" + constructorForSystem.length);
			System.out.println("Constructors From String Class:" + constructorForString.length);
			System.out.println("Constructors From Object Class:" + constructorForObject.length);

		} catch (ClassNotFoundException classNotFoundException) {
			System.out.println("Class String" + classNameForString + " could not be found");
			System.out.println("Class System" + classNameForSystem + " could not be found");
			System.out.println("Class Object" + classNameForObject + " could not be found");

		}

	}
}
