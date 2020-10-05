package com.techlabs.jdbc.demo;

import java.sql.*;

public class UpdationTest {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			System.out.println("successfull connection");

			stmt = conn.createStatement();

			rs = stmt.executeQuery("select * from intern");
			System.out.println("Befor Update");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

			int rows = stmt.executeUpdate("update intern set id=1101 where name=\"prasad\";");

			rs = stmt.executeQuery("select * from intern");

			System.out.println("\nAfter Update");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
		}
	}
}
