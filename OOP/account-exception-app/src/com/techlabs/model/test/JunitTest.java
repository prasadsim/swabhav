package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techlabs.model.Account;

class JunitTest {
	Account acc1 = new Account(101, "Ash", 1000);
	

	
	@Test
	void test() {
		assertEquals(101, acc1.getAccno());
		assertEquals("Ash",acc1.getName());
		assertEquals(1000,acc1.getBalance());
	}

}
