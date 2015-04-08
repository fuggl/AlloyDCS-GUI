package org.alloydcs.dcsrootpane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.alloydcs.engsection.EngineeringSectionController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class DCSRootPaneController implements Initializable {

	@FXML
	private GridPane	topPane;
	@FXML
	private StackPane	centerPane;
	
	public DCSRootPaneController() {
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		final FXMLLoader loader = new FXMLLoader();
		// TODO add alarm bar & tool bar to top pane
		loader.setLocation(EngineeringSectionController.class.getResource(
				"EngineeringSection.fxml"));
		loader.setController(new EngineeringSectionController());
		try {
			final Node engSection = loader.load();
			// TODO add OpSection,CommHubSection,SettingsSection to center pane
			this.centerPane.getChildren().addAll(engSection);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
