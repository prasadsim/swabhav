package com.techlabs.model;

public class Foo {
	@MyBeforeUnitTestCase
	public void bar() {
		System.out.println("Before called!");
	}

	@UnitTestCase
	public boolean m1() {
		return true; // passing testcase
	}

	@UnitTestCase
	public boolean m2() {
		return true;// not a testcase
	}

	@UnitTestCase
	public boolean m3() {
		return false; // failing testcase
	}

	@UnitTestCase
	public boolean m4() {
		return true; // passing testcase
	}
}