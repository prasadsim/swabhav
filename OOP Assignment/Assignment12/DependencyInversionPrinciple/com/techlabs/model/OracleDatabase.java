package com.techlabs.model;

public class OracleDatabase implements IDatabase {

	@Override
	public void connect() {
		System.out.println("Oracle Database is connecting........");
	}

	@Override
	public void disconnect() {
		System.out.println("Oracle Database is dis-connecting........");
	}

}
