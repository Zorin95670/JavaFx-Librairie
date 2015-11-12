package com.aits.javafx.module.connection;

public interface IConnectionAction {

	String getMessage();
	void setMessage(String message);
	
	boolean connect(String login, String password);
}
