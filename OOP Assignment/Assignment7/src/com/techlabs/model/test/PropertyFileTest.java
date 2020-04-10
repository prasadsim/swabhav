package com.techlabs.model.test;

import java.util.*;
import java.io.*;

public class PropertyFileTest {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("data.properties");

		Properties p = new Properties();
		p.load(reader);
		Set<String> at = p.stringPropertyNames();

		usingForEach(at, p);
		usingIterator(p);
	}

	public static void usingForEach(Set<String> at, Properties p) {
		for (String attributes : at) {
			System.out.println(p.getProperty(attributes));
		}
		System.out.println();
	}

	public static void usingIterator(Properties p) {
		Iterator i = p.keySet().iterator();
		while (i.hasNext()) {
			String attributes = (String) i.next();
			String value = p.getProperty(attributes);
			System.out.println(value);
		}
	}
}
