package org.alloydcs.path;

import java.io.File;

public class PathProvider {

	public static final File	ROOT_JAR;
//	public static final File	LANGUAGE;
	
	static {
		final String	path	= PathProvider.class.getProtectionDomain().
				getCodeSource().getLocation().getPath();
		final File		jar		= new File(path);
		ROOT_JAR				= jar.getParentFile();
//		LANGUAGE				= new File(ROOT_JAR.getAbsolutePath() + "/lang");
	}
	
}
