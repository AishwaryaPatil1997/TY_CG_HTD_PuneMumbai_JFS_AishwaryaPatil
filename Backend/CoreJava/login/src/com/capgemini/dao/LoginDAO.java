package com.capgemini.dao;

import com.capgemini.login.LoginBean;

public interface LoginDAO {

	public LoginBean getInfo(int userid, String password);
}
