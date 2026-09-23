package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connectionstatement.ConnectionStatement;

public class PreparedStatementPract {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the user name");
		String userName = sc.nextLine();
		
		System.out.println("Enter the password");
		String password = sc.nextLine();
		
		Connection connection = ConnectionStatement.connection();
		
		PreparedStatement preparedStatement = connection.prepareStatement
			("select * from user where userName = ? and password = ?");
		
		preparedStatement.setString(1 , userName);
		preparedStatement.setString(2 , password);
		
		
		ResultSet executeQuery = preparedStatement.executeQuery();
		
		
		if(executeQuery.next()) {
			System.out.println("Logged in");
		}
		else {
			System.out.println("Invalid credentials");
		}
		
	}

}
