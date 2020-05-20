package com.techlabs.model;

public class DatabaseHandler {
	private IDatabase database;

	public DatabaseHandler(IDatabase database) {
		this.database = database;
	}

	public void connect() {
		this.database.connect();
	}

	public void disconnect() {
		this.database.disconnect();
	}

}
