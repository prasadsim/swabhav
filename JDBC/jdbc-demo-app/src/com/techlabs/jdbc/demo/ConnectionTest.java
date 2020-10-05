package com.techlabs.jdbc.demo;

import java.sql.*;

public class ConnectionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			
			java.sql.Statement stmt=connection.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+"\t"+rs.getFloat(4));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

	}

}
