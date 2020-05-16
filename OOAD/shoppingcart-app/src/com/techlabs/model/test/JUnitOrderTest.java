package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

class JUnitOrderTest {

	LineItem book = new LineItem(UUID.randomUUID(), 20, new Product(UUID.randomUUID(), "Book", 30, 0.25f));

	Order setUp() throws ParseException {
		Order order = new Order(UUID.randomUUID(), "16/05/2020");
		order.addItem(book);
		return order;
	}

	@Test
	void test_OrderDate() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		Date exceptedDate = sdf.parse("16/05/2020");
		assertEquals(exceptedDate, setUp().getDate());
	}

}
