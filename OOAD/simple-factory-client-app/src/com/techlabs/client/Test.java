package com.techlabs.client;

import com.techlabs.product.AutoType;
import com.techlabs.product.AutomobileFactory;
import com.techlabs.product.IAuto;

public class Test {

	public static void main(String[] args) {

		AutomobileFactory factory = AutomobileFactory.getInstance();
		IAuto auto = factory.make(AutoType.Audi);
		auto.start();
		auto.stop();
	}

}
