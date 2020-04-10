package com.techlabs.model.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Properties;

public class PropertyFileTest {

	public static void main(String args[]) throws IOException {

		Properties p = new Properties();
		InputStream is = new FileInputStream("data.properties");

		p.load(is);

		Iterator<?> data = p.keySet().iterator();
		System.out.println("Using enhance for loop:-");
		for (Object value : p.keySet()) {
			System.out.println(p.getProperty(value.toString()));
		}
		System.out.println();
		System.out.println("Using Iterator:-");
		while (data.hasNext()) {
			System.out.println(p.getProperty(data.next().toString()));
		}
	}
}