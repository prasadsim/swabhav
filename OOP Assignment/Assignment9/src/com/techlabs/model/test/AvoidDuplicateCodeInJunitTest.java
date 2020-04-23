package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.techlabs.model.AvoidDuplicateCodeInJunit;

class AvoidDuplicateCodeInJunitTest {

	AvoidDuplicateCodeInJunit a = new AvoidDuplicateCodeInJunit();

	@Before
	void initialize() {
		a.setA(10);
		a.setB(40);
	}

	@Test
	void test() {
		initialize();
		int actualA = a.getA();
		int exceptedA = 10;

		int actualB = a.getB();
		int exceptedB = 40;
		assertEquals(exceptedA, actualA);
		assertEquals(exceptedB, actualB);
	}

}
