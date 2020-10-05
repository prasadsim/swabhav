package com.techlabs.jdbc.demo;

import java.sql.*;

public class DeletionTest {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;	

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			System.out.println("successfull connection");

			stmt = conn.createStatement();

			rs = stmt.executeQuery("select * from intern");
			System.out.println("Befor Delete");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

			int rows = stmt.executeUpdate("delete from intern where name=\"mutuz\";");

			rs = stmt.executeQuery("select * from intern");

			System.out.println("\nAfter Delete");
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
