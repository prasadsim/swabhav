package com.techlabs.model;

public class MySqlDatabase implements IDatabase {

	@Override
	public void connect() {
		System.out.println("MySql Database is connecting........");
	}

	@Override
	public void disconnect() {
		System.out.println("MySql Database is dis-connecting.........");

	}

}
