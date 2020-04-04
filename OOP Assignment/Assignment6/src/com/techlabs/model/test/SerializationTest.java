package com.techlabs.model.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlabs.model.Account;

public class SerializationTest {
	public static void main(String args[]) throws IOException {
		Account acc = new Account(101, "xyz", 10000);
		acc.deposit(2000);

		File file = new File("ser.data");
		doSerialization(acc, file);

	}

	public static void doSerialization(Account acc, File filename) throws IOException {

		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream oout = new ObjectOutputStream(file);

		oout.writeObject(acc);

		oout.close();
		file.close();

		System.out.println("done");

	}

}
