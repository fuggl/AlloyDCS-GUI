package testmain;

import org.alloydcs.language.LocaleHandler;


public class TestMain {

	public static void main(String[] args) {
//		System.out.println(PathProvider.LANGUAGE.listFiles().length);
		LocaleHandler.getDefault().supportedLocalesProperty().stream().
			forEach(locale -> System.out.println(locale.getDisplayName()));
	}
	
}
