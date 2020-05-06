package com.techlabs.model;

public class BarkRecognizer {

	private DogDoor1 door;

	public BarkRecognizer(DogDoor1 door) {
		this.door=door;
	}
	
	public void recognize(String bark) {
		System.out.println("BarkRecognizer: Heard a "+bark+" ' ");
		door.open();
	}
}
