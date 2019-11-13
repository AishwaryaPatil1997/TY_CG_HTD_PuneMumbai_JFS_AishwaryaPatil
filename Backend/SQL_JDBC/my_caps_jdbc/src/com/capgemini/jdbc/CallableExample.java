package com.capgemini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableExample 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		try 
		{
			//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DRIVER LOADED");
			System.out.println("-----------------------------");
			
			//Get the connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db";
			
			System.out.println("Enter user and password: ");
			String user = scan.nextLine();
			String password = scan.nextLine();
			
			conn = DriverManager.getConnection(dbUrl,user,password);
			System.out.println("CONNECTION ESTABLISHED");
			System.out.println("-----------------------------");
			
			//Issue SQL query
			String query = "call getAllInfo()";
			cstmt = conn.prepareCall(query);
			boolean b = cstmt.execute();
			
			if(b)
			{
				rs = cstmt.getResultSet();
				
				while(rs.next())
				{
					System.out.println("User ID: "+rs.getInt(1));
					System.out.println("User Name: "+rs.getString(2));
					System.out.println("Email: "+rs.getString(3));
					System.out.println("Password: "+rs.getString(4));
					
					System.out.println("-----------------------------");
				}
			}
			else
			{
				int i = cstmt.getUpdateCount();
				
				if(i>0)
				{
					System.out.println("OPERATION SUCCESSFULL!!!");
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			if((conn != null) && (cstmt != null) && (rs != null))
			{
				try 
				{
					conn.close();
					cstmt.close();
					rs.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			
			scan.close();
		}
	}
}
