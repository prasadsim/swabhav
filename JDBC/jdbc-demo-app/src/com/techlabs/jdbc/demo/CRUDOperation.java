package com.techlabs.jdbc.demo;

import java.sql.*;

public class CRUDOperation {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) throws SQLException {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			System.out.println("successfull connection");
			stmt = conn.createStatement();			
			selectQuery();
			insertQuery("insert into intern(id,name,lang)\r\n" + "values(1105,\"mutuz\",\"core java\");");
			updateQuery("update intern set id=1101 where name=\"prasad\";");
			deleteQuery("delete from intern where name=\"mutuz\";");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
	}

	private static void updateQuery(String query) throws SQLException {
		int rows = stmt.executeUpdate(query);
		System.out.println("\nAfter Update");
		selectQuery();
	}
	
	private static void deleteQuery(String query) throws SQLException {
		int rows = stmt.executeUpdate(query);
		System.out.println("\nAfter Delete");
		selectQuery();
	}

	private static void insertQuery(String query) throws SQLException {
		int rows = stmt.executeUpdate(query);
		System.out.println("\nAfter Insert");
		selectQuery();
	}	

	public static void selectQuery() throws SQLException {
		rs = stmt.executeQuery("select * from intern");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
	}
}
