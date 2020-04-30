package com.techlabs.model.test;

import com.techlabs.model.CrudUsingLinkedHashSet;

public class CrudUsingLinkedHashSetTest {

	public static void main(String[] args) {
		CrudUsingLinkedHashSet obj=new CrudUsingLinkedHashSet();
		int[] elements= {1,2,3,4,5};
		obj.create(elements);
		obj.delete(4);
		obj.search(5);
	}

}
