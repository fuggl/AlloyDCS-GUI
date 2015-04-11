package org.alloydcs.css;

public class CommonCSS {

	public static String get(String name) {
		return CommonCSS.class.getResource(name).toExternalForm();
	}
	public static String getHideColumnHeaders() {
		return get("hide-column-headers.css");
	}
	
}
