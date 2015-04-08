package org.alloydcs.dcsapp;

import java.io.IOException;

import org.alloydcs.dcsrootpane.DCSRootPaneController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DCSApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		final FXMLLoader loader = new FXMLLoader();
		loader.setLocation(DCSRootPaneController.class.getResource(
				"DCSRootPane.fxml"));
		loader.setController(new DCSRootPaneController());
		try {
			final Parent root = loader.load();
			primaryStage.setScene(new Scene(root));
		} catch(IOException e) {
			e.printStackTrace();
		}
		primaryStage.centerOnScreen();
		primaryStage.show();
		// TODO one extra stage for every screen
		
	}
	
    public static void main(String[] args) {
        launch(args);
    }

}
