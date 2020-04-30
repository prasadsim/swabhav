package com.techlabs.model.test;

import com.techlabs.model.*;

public class CrudUsingArrayListTest {

	public static void main(String[] args) {
		CrudUsingArrayList obj = new CrudUsingArrayList();
		int[] values = { 1, 2, 3, 4, 5 };
		obj.create(values);
		obj.delete(1);
		obj.update(1, 10);
		obj.create(4, 51);
		obj.search(4);
	}

}
