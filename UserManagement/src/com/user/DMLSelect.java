package com.user;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.connectionstatement.ConnectionStatement;

public class DMLSelect {

	public static void main(String[] args) {
		
		Statement statement = ConnectionStatement.getStatement();
		
	
		try {
			ResultSet rs = statement.executeQuery("select * from user");
			
			ResultSetMetaData metaData = rs.getMetaData();
			
			// metaData
			
//			int columnCount = metaData.getColumnCount();
//			String columnName = metaData.getColumnName(1);
//			String columnTypeName = metaData.getColumnTypeName(2);
//          String tableName = metaData.getTableName(2);
//			
//          System.out.println(columnCount);
//          System.out.println(columnName);
//          System.out.println(columnTypeName);
//          System.out.println(tableName);
			
			System.out.println(metaData.getColumnName(1) + " " + metaData.getColumnName(2) + " " + metaData.getColumnName(3));

			while(rs.next()) {
				
				System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "   " + rs.getInt(3));
				
			}
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
