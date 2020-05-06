package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.techlabs.model.JunitExample;

import org.junit.*;

class JunitExampleTest {

	JunitExample j = new JunitExample();

	@Test
	public void testAllMethods() {
		assertEquals(11, j.addNumbers(5, 6));
		assertEquals(2, j.subNumbers(5, 3));
		assertEquals(15, j.multiplyNumbers(5, 3));
		assertEquals(5, j.divideNumbers(4, 20));
	}
}
