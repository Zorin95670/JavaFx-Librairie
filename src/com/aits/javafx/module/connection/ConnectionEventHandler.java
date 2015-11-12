package com.aits.javafx.module.connection;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ConnectionEventHandler implements EventHandler<MouseEvent> {

	private ConnectionPanel root;
	private String login, password;
	
	public ConnectionEventHandler(ConnectionPanel root) {
		setRoot(root);
	}

	public ConnectionPanel getRoot() {
		return root;
	}

	public void setRoot(ConnectionPanel root) {
		this.root = root;
	}
	
	private void init(){
		this.login = getRoot().getLogin().getText();
		this.password = getRoot().getPassword().getText();
	}

	public void handle(MouseEvent event) {
		init();
		if(getRoot().getAction().connect(login, password)){
			getRoot().getErrorLabel().setVisible(false);
			
		} else {
			getRoot().getErrorLabel().setText(getRoot().getAction().getMessage());
			getRoot().getErrorLabel().setVisible(true);
		}
	}
		
}
