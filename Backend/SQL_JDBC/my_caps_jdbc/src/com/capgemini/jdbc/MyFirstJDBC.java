package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try 
		{
			//Load the Driver
			java.sql.Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("DRIVER LOADED");
			
			System.out.println("----------------------------------");
			
			//Get DB connection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=Aishu@1997";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("CONNECTION ESTABLISHED");
			
			System.out.println("----------------------------------");
			
			//Issue SQL Query via Connection
			String query = "SELECT * FROM users_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			//Process the results returned by SQL query
			while(rs.next())
			{
				System.out.println("User ID: "+rs.getInt("userid"));
				System.out.println("User Name: "+rs.getString("username"));
				System.out.println("Email: "+rs.getString("email"));
				System.out.println("Password: "+rs.getString("password"));
				
				System.out.println("----------------------------------");
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			if((conn != null) && (stmt != null) && (rs != null))
			{
				try 
				{
					conn.close();
					stmt.close();
					rs.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
