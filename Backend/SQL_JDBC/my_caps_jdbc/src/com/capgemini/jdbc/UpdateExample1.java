package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateExample1 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner scan = new Scanner(System.in);
		
		try 
		{
			//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");		
			System.out.println("DRIVER LOADED");
			
			System.out.println("----------------------------------");
			
			//Get the connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db";
			
			System.out.println("Enter USER: ");
			String user = scan.nextLine();
			
			System.out.println("Enter PASSWORD: ");
			String password = scan.nextLine();
			
			conn = DriverManager.getConnection(dbUrl,user,password);
			System.out.println("CONNECTION ESTABLISHED");
			
			System.out.println("----------------------------------");
			
			//Issue SQL query via Connection
			String query = "UPDATE users_info SET username = ?, email = ?, password = ? WHERE userid = ?";
			pstmt = conn.prepareStatement(query);
			
			System.out.println("Enter USER ID: ");
			pstmt.setInt(4, Integer.parseInt(scan.nextLine()));
			
			System.out.println("Enter USER NAME: ");
			pstmt.setString(1, scan.nextLine());
			
			System.out.println("Enter email: ");
			pstmt.setString(2, scan.nextLine());
			
			System.out.println("Enter PASSWORD: ");
			pstmt.setString(3, scan.nextLine());
			
			int count = pstmt.executeUpdate();
			
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
			if((conn != null) && (pstmt != null))
			{
				try 
				{
					conn.close();
					pstmt.close();
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
