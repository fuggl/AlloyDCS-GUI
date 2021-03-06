package org.alloydcs.objecttypebrowser;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

import org.alloydcs.objecttype.ObjectType;

public class ObjectTypeBrowserController implements Initializable {

	@FXML
	private TreeTableView<ObjectType> objectTypeTree;
	@FXML
	private TreeTableColumn<ObjectType, String> objectTypeColumn;
	@FXML
	private TreeTableColumn<ObjectType, Integer> objectAmountColumn;
	
	public ObjectTypeBrowserController() {
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		this.objectTypeTree.getStylesheets().add(
//				CommonCSS.getHideColumnHeaders());
    	this.objectTypeColumn.	setCellValueFactory(
    			cellData -> cellData.getValue().getValue().
    			nameProperty());
    	this.objectAmountColumn.setCellValueFactory(
    			cellData -> cellData.getValue().getValue().
    			amountInProjectProperty().asObject());
	}
	
}
