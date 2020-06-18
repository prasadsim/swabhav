package com.techlabs.model.test;

import com.techlabs.model.*;

public class ObserverTest {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("\nSecond state change: 10");
		subject.setState(10);
	}
}
