package com.techlabs.jdbc.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class FileInputWithSqlQuery {
	private static ResultSet res = null;
	private static Statement stmt = null;
	private static Connection conn = null;

	public static void main(String args[]) throws FileNotFoundException, SQLException {
		conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
		System.out.println("connection successful");
		stmt = conn.createStatement();
		File file = new File("C:\\Users\\prasa\\OneDrive\\Desktop\\swabhav\\swabhav_repo\\JDBC\\jdbc-demo-app\\src\\demo.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String[] data = null;
		String st;
		try {
			while ((st = br.readLine()) != null) {
				data = st.split(",", 0);
				int rows = stmt.executeUpdate("insert into student1 values(" + data[0] + ",'" + data[1] + "',"
						+ data[2]+")");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}

	}

}