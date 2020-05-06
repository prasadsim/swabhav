package com.techlabs.model.test;

import com.techlabs.model.*;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);

		remote.pressButton();
		System.out.println("\nFido has gone outside....");
		System.out.println("\nFido's all done....");

		try {
			Thread.currentThread().sleep(10000);

		} catch (InterruptedException e) {
		}

		System.out.println("...but he's stuck outside!");
		System.out.println("\nFido Starts Barking....");
		System.out.println(".... so Gina grabs the remote control.");
		remote.pressButton();
		System.out.println("\nFido's back inside....");
	}
}
