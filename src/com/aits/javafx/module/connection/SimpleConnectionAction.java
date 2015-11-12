package com.aits.javafx.module.connection;

public class SimpleConnectionAction extends AbstractConnectionAction {

	public boolean connect(String login, String password) {
		if(login == null || login.length() == 0){
			setMessage("Please enter your user name.");
			return false;
		}
		if(password == null || password.length() == 0){
			setMessage("Please enter your password.");
			return false;
		}
		setMessage("Successfull connection.");
		return true;
	}

}
