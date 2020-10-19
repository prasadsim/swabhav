package com.techlabs.jdbc.model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Contact {
	static java.sql.Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	public Contact() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
		stmt = (Statement) conn.createStatement();
	}
	
	public void add(String fname, String lname, String phone, String email) throws SQLException {
		System.out.println("inserting Data");
		stmt.executeUpdate("insert into contact values(\""+fname+"\", \""+lname+"\", \""+phone+"\", \""+email+"\");");
	}

	public void delete(String fname) throws SQLException {
		System.out.println("deleting Data");
		stmt.executeUpdate("delete from contact where fname=\""+fname+"\";");
	}

	public void display() throws SQLException {
		System.out.println("Display Table Contact:");
		rs = stmt.executeQuery("select * from contact");
		while (rs.next()) {
			System.out.println(rs.getString("fname") + "\t" + rs.getString("lname") + "\t" + rs.getString("number") + "\t"
					+ rs.getString("email"));
		}
		System.out.println();
	}
}
