package com.techlabs.fileOperation;

public class WithThis {
	public static void main(String args[]) {
		ModelTest t=new ModelTest();
		t.set(10);
		t.display();
	}
}

class ModelTest {
	private int i;
	void set(int i) {
		this.i=i;//value of i using this pointer, it becomes the class variable value;

	}
	void display() {
		System.out.println(i);
	}
}
