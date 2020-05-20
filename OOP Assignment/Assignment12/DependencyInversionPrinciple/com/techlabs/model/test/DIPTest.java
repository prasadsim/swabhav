package com.techlabs.model.test;

import com.techlabs.model.DatabaseHandler;
import com.techlabs.model.MySqlDatabase;

public class DIPTest {
	public static void main(String[] args) {
		DatabaseHandler databaseHandler = new DatabaseHandler(new MySqlDatabase());
		databaseHandler.connect();
		databaseHandler.disconnect();
	}
}
