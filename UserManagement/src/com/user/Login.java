package com.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.connectionstatement.ConnectionStatement;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the userName");
		String userName = sc.nextLine();
		
		System.out.println("Enter the password");
		String password = sc.nextLine();
		
		Statement statement = ConnectionStatement.getStatement();
		
	//	select * from user where userName = 'Meher' and password = '160';
		String selectQuery = "select * from user where userName = '" + userName +
				"' and password = '" + password + "'";
		
		ResultSet rs = null;
		
	
		try {
			
			rs = statement.executeQuery(selectQuery);
			
			if(rs.next()) {
				System.out.println("Logged in");
			}
			else {
				System.out.println("Invalid credentials");
			}
			
//			if(rs.next()) {
//				if(rs.getString(3).equals(password)) {
//					
//					System.out.println("Logged in");
//				}
//				else {
//					System.out.println("Invalid password");
//				}
//			}
//			else {
//				System.out.println("Invalid userName");
//			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
