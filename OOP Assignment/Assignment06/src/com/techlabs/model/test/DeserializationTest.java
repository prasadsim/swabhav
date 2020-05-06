package com.techlabs  .model.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.model.Account;

public class DeserializationTest {
	public static void main(String args[]) throws ClassNotFoundException, IOException {
		doDeSerialiazation();
	}

	public static void doDeSerialiazation() throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("serialize_file.data");
		ObjectInputStream oin = new ObjectInputStream(file);

		Account acc1 = (Account) oin.readObject();

		oin.close();
		file.close();

		System.out.println(acc1.getBalance());
	}

}