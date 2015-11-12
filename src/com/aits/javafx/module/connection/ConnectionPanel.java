package com.aits.javafx.module.connection;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ConnectionPanel {
	private Node rootLayout;
	
	private Button connection;
	private TextField login;
	private PasswordField password;
	private Label error;
	private IConnectionAction action;
	
	public ConnectionPanel() {
		setAction(new SimpleConnectionAction());
	}
	
	public Node initRootLayout(){
		try {
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(ConnectionPanel.class.getResource("view"+File.separator+"ConnectionPanel.fxml"));
			setRootLayout((Node) loader.load());
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return getRootLayout();
	}
	
	public void initComponent() {
		connection = (Button) getRootLayout().getScene().lookup("#connection");
		login = (TextField) getRootLayout().getScene().lookup("#login");
		password = (PasswordField) getRootLayout().getScene().lookup("#password");
		error = (Label) getRootLayout().getScene().lookup("#error");
		
		connection.setOnMouseReleased(new ConnectionEventHandler(this));
		
		error.setVisible(false);
	}

	
	
	public Node getRootLayout() {
		return rootLayout;
	}

	public void setRootLayout(Node rootLayout) {
		this.rootLayout = rootLayout;
	}

	public Button getConnection() {
		return connection;
	}

	public TextField getLogin() {
		return login;
	}

	public PasswordField getPassword() {
		return password;
	}
	
	public Label getErrorLabel(){
		return error;
	}

	public IConnectionAction getAction() {
		return action;
	}

	public void setAction(IConnectionAction action) {
		this.action = action;
	}
	
}
