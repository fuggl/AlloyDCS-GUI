package org.alloydcs.objecttype;

import org.alloydcs.locale.LocaleHandler;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ObjectType {

	private final StringProperty	name;
	private final IntegerProperty	amountInProject;
	
	public ObjectType(String localeName) {
		this.name				= new SimpleStringProperty(this, "name");
		this.amountInProject	= new SimpleIntegerProperty(this, "amount");
		LocaleHandler localeHandler = LocaleHandler.getDefault();
//		localeHandler.currentLocaleProperty().
	}
	
	public final String getName() {
		return this.name.get();
	}
	public StringProperty nameProperty() {
		return this.name;
	}
	
	public final int getAmountInProject() {
		return this.amountInProject.get();
	}
	public IntegerProperty amountInProjectProperty() {
		return this.amountInProject;
	}
	
}
