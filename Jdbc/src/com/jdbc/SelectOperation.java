package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SelectOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Register a Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish a connection
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		String userName = "root";
		String password = "root";
		
		Connection connection = DriverManager.getConnection(url, userName , password);
		
		
		// Prepare sql query
		
		String selectQuery = "select * from employee";
		
		// create statement 

		Statement statement = connection.createStatement();
		
		// Execute statement
		
		ResultSet res = statement.executeQuery(selectQuery);
		
		while(res.next()) {
			
			int id = res.getInt(1);
			
			String name = res.getString(2);
			
			int salary = res.getInt(3);
			
			System.out.println(id + " " + name + " "+ salary);
			
		}
	}

}
