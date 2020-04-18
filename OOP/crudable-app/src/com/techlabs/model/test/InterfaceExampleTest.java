package com.techlabs.model.test;

import com.techlabs.model.*;

public class InterfaceExampleTest {

	public static void main(String[] args) {
		Database db = new Database();
		db.doDBOperations(new CustomerDB());
		db.doDBOperations(new OrderDB());
		db.doDBOperations(new AddressDB());
	}
}
