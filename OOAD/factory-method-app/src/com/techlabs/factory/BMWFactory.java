package com.techlabs.factory;

public class BMWFactory implements IAutoFactory{

	private static BMWFactory instance;

	private BMWFactory() {
	}

	public static BMWFactory getInstance() {
		if (instance == null) {
			instance = new BMWFactory();
		}
		return instance;
	}

	@Override
	public IAuto make() {
		return new BMW();
	}

}
