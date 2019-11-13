package com.capgemini.dao;

import java.io.FileReader;
import java.util.Properties;

import com.capgemini.login.LoginBean;

public class LoginDAOJDBCImplementation implements  LoginDAO{

	FileReader reader = null;
	Properties prop = null;
	LoginBean login;

	public LoginDAOJDBCImplementation() {
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("db.properties");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public LoginBean getInfo(int userid, String password) {
		
		return null;
	}
}
