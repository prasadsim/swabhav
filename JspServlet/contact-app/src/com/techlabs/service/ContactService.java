package com.techlabs.service;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class ContactService {

	private static ContactService instance = null;
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	private ContactService() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
		stmt = (Statement) conn.createStatement();
	}

	public static ContactService getInstance() throws SQLException, ClassNotFoundException {
		if (instance == null) {
			instance = new ContactService();
		}
		return instance;
	}

	public void addContact(String fname, String lname, String phone, String email) throws SQLException {
		System.out.println("inserting Data");
		stmt.executeUpdate("insert into contact values(\"" + fname + "\", \"" + lname + "\", \"" + phone + "\", \""
				+ email + "\");");
	}

	public void deleteContact(String fname) throws SQLException {
		System.out.println("deleting Data");
		stmt.executeUpdate("delete from contact where fname=\"" + fname + "\";");
	}

	public ResultSet getContact() throws SQLException {
		System.out.println("Display Table Contact:");
		rs = stmt.executeQuery("select * from contact");
		while (rs.next()) {
			System.out.println(rs.getString("fname") + "\t" + rs.getString("lname") + "\t" + rs.getString("number")
					+ "\t" + rs.getString("email"));
		}
		return rs;
	}
}
