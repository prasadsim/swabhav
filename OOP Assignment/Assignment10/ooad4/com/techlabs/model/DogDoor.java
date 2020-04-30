package com.techlabs.model;

import java.util.*;

public class DogDoor {
	private boolean open;
	private String allowedBark;
	List barklist = new ArrayList();

	public DogDoor() {
		this.open = false;
	}

	public void addAllowedBark(Bark otherBark) {
		barklist.add(otherBark);
	}

	public void open() {
		System.out.println("The dog door opens.");
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

	public List getAllowedBark() {
		return barklist;
	}

}
