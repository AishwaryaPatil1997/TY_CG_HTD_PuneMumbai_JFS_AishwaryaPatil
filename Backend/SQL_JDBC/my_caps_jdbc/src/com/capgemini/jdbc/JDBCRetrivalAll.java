package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCRetrivalAll {

	public static void main(String[] args) {

		Connection conn = null;
		FileReader reader = null;
		Properties prop = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);

		try {
			reader = new FileReader("C:\\Users\\AISHWARYA\\Desktop\\db.properties");
			prop = new Properties();
			prop.load(reader);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}


		try {
			//Get the connection
			String dbUrl = prop.getProperty("dbUrl");
			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("CONNECTION ESTABLISHED");
			System.out.println("--------------------------------------");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

		//Issue the query
		String query = "SELECT * FROM users_info where userid = ?";
		try {
			pstmt = conn.prepareStatement(query);

			System.out.println("Enter user id: ");
			pstmt.setInt(1, scan.nextInt());
			rs = pstmt.executeQuery();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

		//Process the result


		try {
			if(rs.next())
			{
				System.out.println("User ID: "+rs.getInt("userid"));
				System.out.println("User Name: "+rs.getString("username"));
				System.out.println("Email: "+rs.getString("email"));
				System.out.println("Password: "+rs.getString("password"));

				System.out.println("----------------------------------");
			}
			else
			{
				System.out.println("INVALID USER ID");
			}
		} 
		catch (SQLException e) {
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
