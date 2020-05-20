package com.techlabs.model.test;

import com.techlabs.model.Dog;
import com.techlabs.model.Tigar;

public class ISPTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Tigar tigar = new Tigar();
		
		dog.eat();
		dog.groom();
		
		tigar.eat();
	}

}
