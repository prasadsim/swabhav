package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) {

		Car car = new Car();
		Bike bike = new Bike();
		Truck truck = new Truck();

		IMovable[] imovables = { car, bike, truck };
		startRide(imovables);
	}

	private static void startRide(IMovable[] imovables) {
		System.out.println("Vehicle is StartRide");
		for (IMovable imovable : imovables) {
			imovable.move();
		}
	}
}
