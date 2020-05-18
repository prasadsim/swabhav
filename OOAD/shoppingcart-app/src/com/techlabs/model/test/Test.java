package com.techlabs.model.test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.UUID;

import com.techlabs.model.*;

public class Test {
	private static double totalCheckOutPrice = 0;

	public static void main(String[] args) throws ParseException, IOException {

		Customer kishore = new Customer(UUID.randomUUID(), "Kishore", "lower Parel");
		Customer vishal = new Customer(UUID.randomUUID(), "Vishal", "Anderi");

		LineItem book = new LineItem(UUID.randomUUID(), 20, new Product(UUID.randomUUID(), "Book", 30, 0.25f));
		LineItem pens = new LineItem(UUID.randomUUID(), 200, new Product(UUID.randomUUID(), "Pen", 10, 0));
		LineItem rulers = new LineItem(UUID.randomUUID(), 20, new Product(UUID.randomUUID(), "Ruler", 40, 0.05f));
		LineItem bags = new LineItem(UUID.randomUUID(), 5, new Product(UUID.randomUUID(), "Bag", 500, 0.15f));
		LineItem mobiles = new LineItem(UUID.randomUUID(), 2, new Product(UUID.randomUUID(), "Mobile", 35000, 0.25f));

		Order Order1 = new Order(UUID.randomUUID(), "16/05/2020");
		Order1.addItem(book);
		Order1.addItem(book);
		Order1.addItem(pens);
		Order1.addItem(rulers);

		Order Order2 = new Order(UUID.randomUUID(), "15/05/2020");
		Order2.addItem(bags);
		Order2.addItem(mobiles);

		kishore.addOrder(Order1);
		kishore.addOrder(Order2);

		printInfo(kishore);

		writeIntoCsv(kishore);
	}

	private static void writeIntoCsv(Customer c) throws IOException {
		FileWriter f = new FileWriter("Shopping.csv");

		f.write("CustID,CustName,CustAddress,OrderId,OrderDate,OrderCheckoutCost,ItemId,ItemQuantity,ItemTotalCost,ProductId,ProductName,ProductPrice,ProductDiscount,PayAmount\n");
		for (Order order : c.getOrders()) {
			String l1 = c.getId() + "," + c.getName() + "," + c.getAddress() + ",";
			for (LineItem item : order.getItems()) {
				String l2 = order.getId() + "," + order.getDate() + "," + order.checkoutCost() + "," + item.getId()
						+ "," + item.getQuantity() + "," + item.calculateItemCost() + "," + item.getProduct().getId()
						+ "," + item.getProduct().getName() + "," + item.getProduct().getPrice() + ","
						+ item.getProduct().getDiscountPercentage() + "," + totalCheckOutPrice + '\n';
				String l3 = l1 + l2;
				f.write(l3);
			}
		}
		f.close();
		System.out.println("FileCreated");
	}

//	private static void writeIntoCsv(Customer c) throws IOException {
//		FileWriter f = new FileWriter("Shopping.csv");
//		double t = 0;
//		f.write("CustomerId:" + c.getId() + "\nCustomerName:" + c.getName() + "\nCustomerAddress:" + c.getAddress());
//		for (Order o : c.getOrders()) {
//			f.write("\n\nOrderDetails:");
//			f.write("\nOrderId:" + o.getId() + "\nTotalCost:" + o.checkoutCost());
//
//			for (LineItem l : o.getItems()) {
//				f.write("\n\nLineItemDetails:");
//				f.write("\nId:" + l.getId() + "\nProductName:" + l.getProduct().getName() + "\nProductQuantity:"
//						+ l.getQuantity() + "\nProductCost:" + l.getProduct().getPrice() + "\nLineCost:"
//						+ l.calculateItemCost());
//			}
//			t = t + o.checkoutCost();
//		}
//		f.write("\n\nTotalCheckOutCost:" + t);
//		f.close();
//		System.out.println("FileCreated");
//	}

	private static void printInfo(Customer customer) {

		System.out.println(customer);
		for (Order o : customer.getOrders()) {
			System.out.println("\nOrderDetails");
			System.out.println("Id:" + o.getId() + "\tTotalCost:" + o.checkoutCost());
			System.out.println("\nList of Products");
			for (LineItem i : o.getItems()) {
				System.out.println("Id:" + i.getId() + " ProductName:" + i.getProduct().getName() + " Quantity:"
						+ i.getQuantity() + " SingleProductPrice:" + i.getProduct().getPrice() + " LineCost:"
						+ i.calculateItemCost());
			}
			totalCheckOutPrice = totalCheckOutPrice + o.checkoutCost();
		}
		System.out.println("\nTotalCheckOutPrice:" + totalCheckOutPrice + "\n");

	}
}