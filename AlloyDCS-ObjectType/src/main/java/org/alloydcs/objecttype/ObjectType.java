package org.alloydcs.objecttype;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ObjectType {

	private final StringProperty	name;
	private final IntegerProperty	amount;
	
	public ObjectType(String localeName) {
		this.name	= new SimpleStringProperty(this, "name");
		this.amount	= new SimpleIntegerProperty(this, "amount");
	}
	
	public final String getName() {
		return this.name.get();
	}
	public StringProperty nameProperty() {
		return this.name;
	}
	
	public final int getAmount() {
		return this.amount.get();
	}
	public IntegerProperty amountProperty() {
		return this.amount;
	}
	
}
