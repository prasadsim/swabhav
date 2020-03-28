package com.techlabs.model.test;

import com.techlabs.model.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer("Abc", 10);
		System.out.println("Id of C1:" + c1.getId());
		Customer c2 = new Customer("Pqr", 10);
		System.out.println("Id of C2:" + c2.getId());
		Customer c3 = new Customer("Xyz", 10);
		System.out.println("Id of C3:" + c3.getId());
		System.out.println("Id of C1:" + c1.getId());
		System.out.println("Id of C2:" + c2.getId());

	}

}
