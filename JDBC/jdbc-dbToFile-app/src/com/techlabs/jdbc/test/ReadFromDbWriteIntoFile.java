package com.techlabs.jdbc.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

public class ReadFromDbWriteIntoFile {
	private static ResultSet res = null;
	private static Statement stmt = null;
	private static Connection conn = null;

	public static void main(String[] args) throws SQLException {

		List data = new ArrayList<String>();

		conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
		System.out.println("connection successful");
		stmt = conn.createStatement();
		res = stmt.executeQuery("select * from person");

		while (res.next()) {
			String id = res.getString("id");
			String name = res.getString("name");
			String age = res.getString("age");
			String gender = res.getString("gender");
			String phone = ifNull(res.getString("phone"));
			data.add(id + "," + name + "," + age + "," + "," + gender + "," + phone);
		}

		writeToFile(data, "person.txt");
		res.close();
		stmt.close();
		conn.close();

	}

	private static String ifNull(String value) {
		if (value == null) {
			return "unknown";
		}
		return value;
	}

	private static void writeToFile(List<String> rows, String fileName) {
		BufferedWriter out = null;
		try {
			File file = new File(fileName);
			out = new BufferedWriter(new FileWriter(file, true));
			for (String row : rows) {
				out.write(row);
				out.newLine();
			}
			out.close();
			System.out.println("Written into file....");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
