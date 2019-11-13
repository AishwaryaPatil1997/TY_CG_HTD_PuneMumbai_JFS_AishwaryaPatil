package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCRetrival 
{
	public static void main(String[] args) 
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);

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

			//Issue the SQL query
			String query = "SELECT * FROM users_info "
					+ "where userid = ?";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter the USER ID: ");
			pstmt.setInt(1, scan.nextInt());
			rs = pstmt.executeQuery();

			System.out.println("----------------------------------");

			//Process the results
			if(rs.next())
			{
				System.out.println("User ID: "+rs.getInt(1));
				System.out.println("User Name: "+rs.getString(2));
				System.out.println("Email: "+rs.getString(3));
				System.out.println("Password: "+rs.getString(4));

				System.out.println("----------------------------------");
			}
			else
			{
				System.err.println("Invalid User ID");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		finally
		{
			if((conn != null) && (pstmt != null) && (rs != null))
			{
				try 
				{
					conn.close();
					pstmt.close();
					rs.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
		
		scan.close();
	}
}
