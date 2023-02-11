package com.webapplication.login;

public class UserValidation {
	
	public boolean isUserValid(String user, String password) {
		if(user.equals("yash") && password.equals("123456"))
			return true;
		
		return false;
	}
	
}
