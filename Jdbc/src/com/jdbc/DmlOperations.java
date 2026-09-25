package com.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class DmlOperations{
	
	public static void main(String [] args) throws ClassNotFoundException , SQLException {
	
		// Register a river
		System.out.println("Starting Register a Driver");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Register a Driver");
		
		// Establish connection
	    String url = "jdbc:mysql://localhost:3306/jdbc";
	    String userName = "root";
	    String password = "root";
	    
		Connection connection = DriverManager.getConnection(url , userName, password);
		System.out.println("Connection established");
		
		// prepare sql query
  		String insertQuery = "insert into employee values(3 , 'Prasanna' , 25000)";
		
	//	String UpdatedQuery = "update employee set id = 2 where name = 'Krishna'";
		
  		System.out.println("query inserted");
  		
	//	System.out.println("Query updated");
  		
		// create a statement
		Statement statement = connection.createStatement();
		
		System.out.println("Statement created");
	
		
		// Execute statement
		statement.executeUpdate(insertQuery);
	//	statement.executeUpdate(UpdatedQuery);
		
		System.out.println("statement executed");
		
		// close resources
		connection.close();
		statement.close();
		
		System.out.println("resources closed");
		
		
	}
}
