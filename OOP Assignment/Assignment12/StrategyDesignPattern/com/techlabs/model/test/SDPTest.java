package com.techlabs.model.test;

import com.techlabs.model.CreditDebitPaymentStrategy;
import com.techlabs.model.Item;
import com.techlabs.model.PaypalPaymentStrategy;
import com.techlabs.model.ShoppingCart;

public class SDPTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("12345", 50);
		Item item2 = new Item("67890", 90);

		cart.addItem(item1);
		cart.addItem(item2);

		cart.pay(new CreditDebitPaymentStrategy("Prasad Simarla", "1234567890123456", "786", "12/15"));
		cart.pay(new PaypalPaymentStrategy("prasadsim075@gmail.com", "mypassword"));
	}

}
