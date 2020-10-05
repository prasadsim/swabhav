package com.techlabs.jdbc.demo;

import java.sql.*;

public class InsertionTest {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			System.out.println("successfull connection");

			stmt = conn.createStatement();

			int rows = stmt.executeUpdate("insert into intern(id,name,lang)\r\n" + "values(1105,\"mutuz\",\"core java\");");

			rs = stmt.executeQuery("select * from intern");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
				conn.close();
			}
		}
	}
}
