package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.techlabs.model.LineItem;
import com.techlabs.model.Product;

class JUnitLineItemAndProductTest {
	LineItem book = new LineItem(UUID.randomUUID(), 20, new Product(UUID.randomUUID(), "Book", 30, 0.25f));

	@Test
	void test_LineItemQuantity() {
		int actualQuantity = book.getQuantity();
		assertEquals(20, actualQuantity);
	}

	void test_LineItemCost() {
		double actualCost = book.calculateItemCost();
		double exceptedCost = 20 * (30 - (30 * 0.25));
		assertEquals(exceptedCost, actualCost);
	}

	void test_LineItemProductCost() {
		double actualCost = book.getProduct().totalCost();
		double exceptedCost = (30 - (30 * 0.25));
		assertEquals(exceptedCost, actualCost);
	}

	void test_LineItemProductName() {
		String actualName = book.getProduct().getName();
		assertEquals("Book", actualName);
	}

	void test_LineItemProductPrice() {
		double actualPrice = book.getProduct().getPrice();
		assertEquals(30, actualPrice);
	}
}
