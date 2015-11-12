package com.aits.javafx;

import com.aits.javafx.module.connection.ConnectionPanel;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("TestLibrary");
        
        ConnectionPanel panel = new ConnectionPanel();
        panel.initRootLayout();
        
        Scene scene = new Scene((Parent) panel.getRootLayout());
        
        panel.initComponent();
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
	}

	public static void main(String[] args) {
		launch(args);
	}
}
