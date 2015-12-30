package org.alloydcs.locale;

public interface LocaleListener {

	void localeChanged();
	
	static void registerToDefault() {
		LocaleHandler.getDefault();
	}
	
}
