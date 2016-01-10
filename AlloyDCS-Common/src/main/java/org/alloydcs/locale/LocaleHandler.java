package org.alloydcs.locale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyListProperty;
import javafx.beans.property.ReadOnlyListWrapper;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;

public class LocaleHandler {

	private static final LocaleHandler			DEFAULT;
	static {
		DEFAULT = new LocaleHandler();
	}
	private HashMap<String, ResourceBundle>		currentBundle;
	private final ObjectProperty<Locale>		currentLocale;
	private final ReadOnlyListWrapper<Locale>	supportedLocales;
	
	public LocaleHandler() {
		this.currentLocale		= new SimpleObjectProperty<Locale>(
				this, "currentLocale");
		this.supportedLocales	= new ReadOnlyListWrapper<Locale>(
				this, "availableLocales");
		this.updateSupportedLocales();
		this.setCurrentLocale(Locale.getDefault());
	}
	public LocaleHandler(Locale initialLocale) {
		this.currentLocale		= new SimpleObjectProperty<Locale>(
				this, "currentLocale");
		this.supportedLocales	= new ReadOnlyListWrapper<Locale>(
				this, "availableLocales");
		this.updateSupportedLocales();
		this.setCurrentLocale(initialLocale);
	}

	private ResourceBundle getBundle(String baseName, Locale locale) {
		try {
			return ResourceBundle.getBundle("language/" + baseName, locale);
		} catch (Exception e) {
			//ToDo exception
			return null;
		}
	}
	
	public static final LocaleHandler getDefault() {
		return DEFAULT;
	}
	
	public String getText(String key) {
		try {
			return this.currentBundle.getString(key);
		} catch(NullPointerException e) {
			return "<null key>";
		} catch(MissingResourceException e) {
			return "<missing: " + key + ">";
		}
	}
	
	public final Locale getCurrentLocale() {
		return this.currentLocale.get();
	}
	public final void setCurrentLocale(Locale locale) {
		if(locale == null) return;
//		final ResourceBundle bundle = this.getBundle("DCS", locale);
//		if(bundle != null) this.currentBundle = bundle;
		this.currentLocale.set(locale);
	}
	public ObjectProperty<Locale> currentLocaleProperty() {
		return this.currentLocale;
	}

	public void updateSupportedLocales() {
		final BufferedReader reader = new BufferedReader(
				new InputStreamReader(
						this.getClass().getClassLoader().getResourceAsStream(
								"language/")));
		try {
			String					line;
			String[]				splitLine;
			final ArrayList<Locale>	locales = new ArrayList<>();
			locales.add(new Locale("en", "US"));
			while((line = reader.readLine()) != null) {
				splitLine = line.split("_");
				switch(splitLine.length) {
				case 2:
					locales.add(new Locale(splitLine[1]));
					break;
				case 3:
					locales.add(new Locale(splitLine[1],
							splitLine[2].substring(0, 2)));
					break;
				}
			}
			supportedLocales.set(FXCollections.observableArrayList(locales));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public ReadOnlyListProperty<Locale> supportedLocalesProperty() {
		return this.supportedLocales.getReadOnlyProperty();
	}
	
}
