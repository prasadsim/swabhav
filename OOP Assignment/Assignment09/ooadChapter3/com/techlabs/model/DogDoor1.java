package com.techlabs.model;

import java.util.*;

public class DogDoor1 {
	private boolean open;

	public DogDoor1() {
		this.open = false;
		
	}

	public void open() {
		System.out.println("The Dog Door Opens....");
		open = true;
		
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		},5000);
	}

	public void close() {
		System.out.println("The Dog Door Close....");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

}
