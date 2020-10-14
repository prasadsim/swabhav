package com.techlabs.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementFilterTest {

	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter person id:-");
		String personId=scan.nextLine();
		Connection conn=null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
			System.out.println("connection successful");
			
			Statement stmt=conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from person where id="+personId);
			
			while(rs.next()) {
				System.out.println("PersonId:"+rs.getString("id")+" Name:"+rs.getString("name")+" age:"+rs.getString("age"));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			conn.close();
		}
	}

}
