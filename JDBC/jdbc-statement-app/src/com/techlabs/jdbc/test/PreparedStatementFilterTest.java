package com.techlabs.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class PreparedStatementFilterTest {

	public static void main(String[] args) throws SQLException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter person id:-");
		String personId = scan.nextLine();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");

			PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("select * from person where id=?");
			stmt.setString(1, personId);

			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()==false) {
				System.out.println("No Record");
			}

			while (rs.next()) {
				System.out.println("PersonTabel\nId:" + rs.getString("id") + " Name:" + rs.getString("name") + " age:"
						+ rs.getString("age"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}

}
