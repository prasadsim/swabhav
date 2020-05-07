package com.techlabs.model.test;

import java.util.*;
import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) throws KeyAlreadyPresentException {
		System.out.println("***HashMap***");
		hashmap();
		System.out.println("\n***TreeMap***");
		treemap();
		System.out.println("\n***HashSet***");
		hashset();
		System.out.println("\n***TreeSet***");
		treeset();
		System.out.println("\n***Vector***");
		vector();
	}

	private static void vector() {
		CrudUsingVector obj = new CrudUsingVector();
		obj.create(1);
		obj.create(25);
		obj.create(45);
		obj.create(42);
		obj.create('a');
		obj.create('d');
		obj.create('z');
		obj.create("Ash");
		obj.create("rajat");
		obj.create("sim");
		obj.read();
		obj.delete(8);
		obj.delete("sim");
	}

	private static void treeset() {
		CrudUsingTreeSet obj = new CrudUsingTreeSet();
		String[] elements = { "ash", "sim", "rajat", "vaibhav", "shubham", "prasad" };
		obj.create(elements);
		obj.read();
		obj.delete("sim");
		obj.update("rajat", "pablo");
		obj.search("ash");
		obj.sortTreeSet();
	}

	private static void hashset() {
		CrudUsingHashSet obj = new CrudUsingHashSet();
		String[] elements = { "ash", "sim", "rajat", "vaibhav", "shubham", "prasad" };
		obj.create(elements);
		obj.read();
		obj.delete("sim");
		obj.update("rajat", "pablo");
		obj.search("ash");
		obj.sortHashSet();
	}

	private static void treemap() {
		CrudUsingTreeMap obj = new CrudUsingTreeMap();
		try {
			obj.create(12, "Ash");
			obj.create(2, "Sim");
			obj.create(3, "Vaibhav");
			obj.create(4, "Chirag");
			obj.create(4, "Prasad");
		} catch (KeyAlreadyPresentException e) {
			System.out.println(e.getMessage());
		}
		obj.read();
		obj.delete(3);
		obj.update(4, "Rajat");
		obj.search(12);
	}

	private static void hashmap() throws KeyAlreadyPresentException {
		CrudUsingHashMap obj = new CrudUsingHashMap();
		try {
			obj.create(1, "Ash");
			obj.create(2, "Sim");
			obj.create(3, "Vaibhav");
			obj.create(4, "Chirag");
			obj.create(4, "Pr");
		} catch (KeyAlreadyPresentException e) {
			System.out.println(e.getMessage());
		}
		obj.read();
		obj.delete(3);
		obj.update(4, "Rajat");
		obj.search(1);
	}

}
