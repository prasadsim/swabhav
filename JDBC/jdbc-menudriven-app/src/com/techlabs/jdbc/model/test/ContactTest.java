package com.techlabs.jdbc.model.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.techlabs.jdbc.model.Contact;

public class ContactTest {

	public static void main(String[] args) throws SQLException {

		Contact contact = new Contact();
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Contact Table\n 1. Display the Contact\n 2. Insert the contact\n 3. Delete the contact\n 4.Exit");
		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			contact.display();
			break;
		case 2: {
			System.out.println("Enter First Name:");
			String fname = scan.next();
			System.out.println("Enter Last Name:");
			String lname = scan.next();
			System.out.println("Enter Phone No:");
			String phone = scan.next();
			System.out.println("Enter Email Id:");
			String email = scan.next();
			contact.add(fname, lname, phone, email);
			break;
		}
		case 3:
			System.out.println("Enter First Name to Delete:");
			String fname = scan.next();
			contact.delete(fname);
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		}

	}

}
