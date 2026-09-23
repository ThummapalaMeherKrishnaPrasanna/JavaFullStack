package com.connectionstatement;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.constant.DB;

public class ConnectionStatement {


	
   public static Connection connection() {
	  
	   
		Connection connection = null;
		   try {
			   
			  connection = DriverManager.getConnection(DB.URL , DB.USERNAME , DB.PASSWORD);
			
		   }catch (SQLException e) {
			
			System.out.println(e.getMessage());
			
		   }  
		   
		   return connection;
	   
   }
   
   public static Statement getStatement() {
	   
	  Connection connection = connection(); 
	   Statement statement = null;
	   
	   try {
		   
	   statement = connection.createStatement();
		
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	   
	   return statement;
   }
   
}
