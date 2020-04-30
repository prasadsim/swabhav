package com.techlabs.model;

public class Bark {

	private String sound;

	public Bark(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public boolean equals(Bark bark) {
		if (this.sound.equalsIgnoreCase(bark.sound)) {
			return true;
		}
		return false;
	}
}
