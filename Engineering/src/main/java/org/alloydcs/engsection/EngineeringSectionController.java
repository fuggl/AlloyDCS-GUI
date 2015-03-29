package org.alloydcs.engsection;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.alloydcs.objecttypebrowser.ObjectTypeBrowserController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class EngineeringSectionController implements Initializable {

	@FXML
	private BorderPane	objectPane;
	@FXML
	private GridPane	objectBrowserPane;
	@FXML
	private GridPane	objectDataPane;
	
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
			this.objectBrowserPane.add(objectTypeBrowser, 0, 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
