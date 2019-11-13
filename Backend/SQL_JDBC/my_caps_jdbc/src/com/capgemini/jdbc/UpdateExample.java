package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		Statement stmt = null;
		
		try 
		{
			//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");		
			System.out.println("DRIVER LOADED");
			
			System.out.println("----------------------------------");
			
			//Get the connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=Aishu@1997";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("CONNECTION ESTABLISHED");
			
			System.out.println("----------------------------------");
			
			//Issue SQL query via Connection
			String query = "UPDATE users_info set email = 'aishu10@yahoo.com' where userid = 2019006";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(query);
			
			//Process the results
			if(count>0)
			{
				System.out.println("DATA UPDATED...");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			if((conn != null) && (stmt != null))
			{
				try 
				{
					conn.close();
					stmt.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
