package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Customer;
import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

class JUnitCustomer {

	LineItem book = new LineItem(UUID.randomUUID(), 20, new Product(UUID.randomUUID(), "Book", 30, 0.25f));

	Customer setUp() throws ParseException {
		Order order = new Order(UUID.randomUUID(), "16/05/2020");
		order.addItem(book);
		Customer kishore = new Customer(UUID.randomUUID(), "Kishore", "lower Parel");
		kishore.addOrder(order);
		return kishore;
	}

	@Test
	void test_CustomerName() throws ParseException {
		assertEquals("Kishore", setUp().getName());
	}

	void test_CustomerAddress() throws ParseException {
		assertEquals("lower Parel", setUp().getAddress());
	}

}
