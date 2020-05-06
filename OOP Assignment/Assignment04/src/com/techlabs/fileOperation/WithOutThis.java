package com.techlabs.fileOperation;

public class WithOutThis {
	public static void main(String args[]) {
		Test t = new Test();
		t.set(10);
		t.display();
	}
}

class Test {
	private int i;

	void set(int i) {
		i = i; //value of i is only a function variable
	}

	void display() {
		System.out.println(i);

	}
}
