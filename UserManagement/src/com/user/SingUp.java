package com.user;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.connectionstatement.ConnectionStatement;

public class SingUp {

	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the name");
	  String userName = sc.nextLine();
	  
	  System.out.println("Enter the password");
	  int password = sc.nextInt();
	  
	  Statement statement = ConnectionStatement.getStatement();
	 
	  
	  String insertQuery = "insert into user (userName , password ) values('" + userName + "' ,"
		  		+ " '" + password + "')";
	  
		try {
			  
			statement.executeUpdate(insertQuery);
			System.out.println("user successfully signed in");
			
			
		} catch (SQLException e) {
			
			System.out.println("Duplicate entry");
		
		}
		
	}

}
