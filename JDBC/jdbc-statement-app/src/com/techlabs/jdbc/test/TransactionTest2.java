package com.techlabs.jdbc.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TransactionTest2 {
	static Connection conn = null;

	public static void main(String[] args) throws SQLException {
		try {
			conn = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
			System.out.println("connection successful");

			conn.setAutoCommit(false);

			Statement stmt = (Statement) conn.createStatement();

			stmt.executeUpdate("UPDATE customer1 SET balance=balance-100 WHERE id=1;");// deduct from customer

			stmt.executeUpdate("UPDATE merchant SET balance=balance+100 WHERE id=1;");// increment merchant

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
}
