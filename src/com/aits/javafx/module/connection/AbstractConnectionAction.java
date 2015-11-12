package com.aits.javafx.module.connection;

public abstract class AbstractConnectionAction implements IConnectionAction {

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
