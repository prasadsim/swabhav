package com.techlabs.product;

public class AutomobileFactory {

	private static AutomobileFactory instance = new AutomobileFactory();

	private AutomobileFactory() {
	}

	public static AutomobileFactory getInstance() {
		if (instance == null) {
			instance = new AutomobileFactory();
		}
		return instance;
	}

	public IAuto make(AutoType type) {
		if (type == AutoType.Audi) {
			return new Audi();
		} else if (type == AutoType.BMW) {
			return new BMW();
		} else
			return new Tesla();
	}

}
