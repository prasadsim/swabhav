package com.techlabs.model.test;

import java.text.ParseException;
import java.util.UUID;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) throws ParseException {
		Customer kishore = new Customer(UUID.randomUUID(), "Kishore", "lower Parel");
		Customer vishal = new Customer(UUID.randomUUID(), "Vishal", "Anderi");

		LineItem books = new LineItem(UUID.randomUUID(), 20, new Product(UUID.randomUUID(), "Book", 30, 0.25f));
		LineItem pens = new LineItem(UUID.randomUUID(), 200, new Product(UUID.randomUUID(), "Pen", 10, 0));
		LineItem rulers = new LineItem(UUID.randomUUID(), 20, new Product(UUID.randomUUID(), "Ruler", 40, 0.05f));
		LineItem bags = new LineItem(UUID.randomUUID(), 50, new Product(UUID.randomUUID(), "Bag", 500, 0.15f));
		LineItem mobiles = new LineItem(UUID.randomUUID(), 2, new Product(UUID.randomUUID(), "Mobile", 35000, 0.25f));

		Order Order1 = new Order(UUID.randomUUID(), "16/05/2020");
		Order1.addItem(books);
		Order1.addItem(pens);
		Order1.addItem(rulers);

		Order Order2 = new Order(UUID.randomUUID(), "15/05/2029");
		Order2.addItem(bags);
		Order2.addItem(mobiles);

		kishore.addOrder(Order1);
		kishore.addOrder(Order2);

		printInfo(kishore);

	}

	private static void printInfo(Customer customer) {
		double totalCheckOutPrice = 0;
		System.out.println(customer);
		System.out.println(customer.getOrders().size());
		for (Order o : customer.getOrders()) {
			System.out.println("\nOrderDetails");
			System.out.println("Id:" + o.getId() + "\tTotalCost:" + o.checkoutCost());
			System.out.println("\nList of Products");
			for (LineItem i : o.getItems()) {
				System.out.println("Id:" + i.getId() + " ProductName:" + i.getProduct().getName() + " Quantity:"
						+ i.getQuantity() + " SingleProductPrice:" + i.getProduct().getPrice()+" LineCost:"+i.calculateItemCost());
			}
			totalCheckOutPrice = totalCheckOutPrice + o.checkoutCost();
		}
		System.out.println("\nTotalCheckOutPrice:" + totalCheckOutPrice);
	}
}