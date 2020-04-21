package com.techlabs.model.test;

import com.techlabs.model.*;

public class DogDoorSimulator1 {
	public static void main(String[] args) {
		DogDoor1 door = new DogDoor1();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote1 remote = new Remote1(door);

		System.out.println("Fido Starts Barking...");
		recognizer.recognize("Woof");
		System.out.println("\nFido has gone outside....");

		System.out.println("\nFido's all done....");

		try {
			Thread.currentThread().sleep(10000);

		} catch (InterruptedException e) {
		}

		System.out.println("...but he's stuck outside!");
		System.out.println("\nFido Starts Barking....");
		recognizer.recognize("Woof");
		System.out.println("\nFido's back inside....");

	}

}
