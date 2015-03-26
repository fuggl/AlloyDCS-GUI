package org.alloydcs.objecttypebrowser;

import org.alloydcs.objecttype.ObjectType;

import javafx.fxml.FXML;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

public class ObjectTypeBrowserController {

	@FXML
	private TreeTableView<ObjectType> objectTypeTree;
	@FXML
	private TreeTableColumn<ObjectType, String> objectTypeColumn;
	@FXML
	private TreeTableColumn<ObjectType, Integer> objectAmountColumn;
	
	public ObjectTypeBrowserController() {
		
	}

    @FXML
    private void initialize() {
    	
    }
	
}
