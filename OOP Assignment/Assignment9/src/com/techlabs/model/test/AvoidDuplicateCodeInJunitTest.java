package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techlabs.model.AvoidDuplicateCodeInJunit;

class AvoidDuplicateCodeInJunitTest {

	AvoidDuplicateCodeInJunit a = new AvoidDuplicateCodeInJunit();

	@BeforeEach
	public void initialize() {
		a.setA(10);
		a.setB(40);
		System.out.println("hi");
	}

	@Test
	void test() {
		int actualA = a.getA();
		int exceptedA = 10;

		int actualB = a.getB();
		int exceptedB = 40;
		assertEquals(exceptedA, actualA);
		assertEquals(exceptedB, actualB);
	}

}
