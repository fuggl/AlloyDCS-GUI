package org.alloydcs.engsection;

import java.net.URL;
import java.util.ResourceBundle;

import org.alloydcs.objecttypebrowser.ObjectTypeBrowserController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class EngineeringSectionController implements Initializable {

	@FXML
	private BorderPane	objectPane;
	@FXML
	private GridPane	objectBrowserPane;
	@FXML
	private GridPane	objectDataPane;
	private ObjectTypeBrowserController	objectTypeBrowser;
	
	public EngineeringSectionController() {
		this.objectTypeBrowser = new ObjectTypeBrowserController();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ObjectTypeBrowserController.class.getResource(
				"ObjectTypeBrowser.fxml"));
		loader.setController(this.objectTypeBrowser);
//		loader.load();
//    	this.objectBrowserPane.add(, 0, 0);
	}
	
}
