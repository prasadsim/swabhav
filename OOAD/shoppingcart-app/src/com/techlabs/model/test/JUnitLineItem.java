package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlabs.model.LineItem;
import com.techlabs.model.Product;

class JUnitLineItem {
	int actualQuantity;
	@BeforeAll
	void setUp() throws Exception {
		LineItem books = new LineItem(UUID.randomUUID(), 20, new Product(UUID.randomUUID(), "Book", 30, 0.25f));
		actualQuantity=books.getQuantity();
	}

	@Test
	void test() {
		assertEquals(20,actualQuantity);
	}

}
