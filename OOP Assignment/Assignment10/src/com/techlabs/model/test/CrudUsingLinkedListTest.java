package com.techlabs.model.test;

import com.techlabs.model.CrudUsingLinkedList;

public class CrudUsingLinkedListTest {

	public static void main(String[] args) {
		CrudUsingLinkedList obj=new CrudUsingLinkedList();
		int[] values= {1,2,3,4,5};
		obj.create(values);
		obj.delete(2);
		obj.update(3, 48);
		obj.search(4);
	}

}
