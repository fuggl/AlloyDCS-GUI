package org.alloydcs.engsection;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

import org.alloydcs.objecttypebrowser.ObjectTypeBrowserController;

public class EngineeringSectionController implements Initializable {

	@FXML
	private GridPane	leftPane;
	@FXML
	private GridPane	centerPane;
	
	public EngineeringSectionController() {
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		final FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ObjectTypeBrowserController.class.getResource(
				"ObjectTypeBrowser.fxml"));
		loader.setController(new ObjectTypeBrowserController());
		try {
			final Node objectTypeBrowser = loader.load();
			this.leftPane.add(objectTypeBrowser, 0, 0);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
