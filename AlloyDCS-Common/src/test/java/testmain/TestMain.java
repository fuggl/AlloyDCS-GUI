package testmain;

import java.util.Locale;

import org.alloydcs.locale.LocaleHandler;


public class TestMain {

	public static void main(String[] args) {
//		System.out.println(PathProvider.LANGUAGE.listFiles().length);
//		LocaleHandler.getDefault().supportedLocalesProperty().stream().
//			forEach(locale -> System.out.println(locale.getDisplayName()));
		new LocaleHandler(new Locale("en", "GB"));
		String n = "EngineeringSectionController";
		//LocaleHandler.class.getSimpleName();
		System.out.println(n.substring(0, n.length()-10));
	}
	
}
