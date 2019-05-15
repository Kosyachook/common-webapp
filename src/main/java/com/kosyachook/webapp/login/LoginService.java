package com.kosyachook.webapp.login;

public class LoginService {
	public boolean validateUser(String user, String password) {
		//return user.equalsIgnoreCase("in28sec") && password.equals("parol");
		if (user.equals("in28sec") && password.equals("parol"))
			return true;

		return false;
	}
}
