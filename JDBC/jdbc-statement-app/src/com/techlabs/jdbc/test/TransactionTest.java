package com.techlabs.jdbc.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TransactionTest {
	static Connection conn = null;
	static Statement stmt = null;

	public static void main(String[] args) throws SQLException {
		try {
			conn = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
			System.out.println("connection successful");

			conn.setAutoCommit(false);

			stmt = (Statement) conn.createStatement();

			decrementBalance("customer1", "2", "200");
			incrementBalance("merchant", "1", "200");
			decrementBalance("customer1", "1", "300");
			incrementBalance("merchant", "1", "300");
			System.out.println("transaction successfull");

			conn.commit();

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
				System.out.println("error in transaction, rollback done");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (conn != null)
				conn.close();
		}
	}

	private static void incrementBalance(String tableName, String id, String valueToIncrement) throws SQLException {
		stmt.executeUpdate("update " + tableName + " set balance=balance+" + valueToIncrement + " where id=" + id);
	}

	private static void decrementBalance(String tableName, String id, String valueToDecrement) throws SQLException {
		stmt.executeUpdate("update " + tableName + " set balance=balance+" + valueToDecrement + " where id=" + id);
	}
}
