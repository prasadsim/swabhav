package com.techlabs.model;

public class Remote1 {

	private DogDoor1 door;

	public Remote1(DogDoor1 door) {
		this.door = door;
	}

	public void pressButton() {
		System.out.println("Pressing the Remote Control Button........");
		if (door.isOpen()) {
			door.close();
		} else {
			door.open();
		}
	}
}
