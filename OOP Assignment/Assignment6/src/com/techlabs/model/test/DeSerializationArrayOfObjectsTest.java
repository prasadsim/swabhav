package com.techlabs.model.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.model.Account;

public class DeSerializationArrayOfObjectsTest {
	public static void main(String args[]) throws Exception {
		doDeSerialiazation();
	}

	public static void doDeSerialiazation() throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("serialize_file_array.data");
		ObjectInputStream in = new ObjectInputStream(file);

		Account[] acc = (Account[]) in.readObject();

		in.close();
		file.close();

		for (Account accounts : acc) {
			printInfo(accounts);

		}
	}

	public static void printInfo(Account acc) {
		System.out.println("account id: " + acc.getAccno() + "\t account name: " + acc.getName()
				+ "\t account balance: " + acc.getBalance());
	}

}