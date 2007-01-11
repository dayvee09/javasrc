package regex;

import java.util.regex.Pattern;

public class EmailValidator {

	private final static String PATTERN =
		"[\\w._-]+@([a-zA-Z][\\w-]*\\.)+\\w{2,4}$";

	private final static String[] goodTests = {
		"a@b.ca",
		"bernard_mugabe@illicit.gov.ke",
		"i.f.d.@darwin-systems.ca"
	};

	private final static String[] badTests = {
		"erewhon",
		"ian@2leftfeet.com",	// cannot begin with a number
		"ian@home",				// no dot
		"ian@home.notathome",		// TLD too long
	};

	public static void main(String[] args) {
		Pattern patt = Pattern.compile(PATTERN);
		System.out.println("Should match:");
		for (String test : goodTests) {
			System.out.println(test + " --> " + patt.matcher(test).matches());
		}

		System.out.println("Should NOT match:");
		for (String test : badTests) {
			System.out.println(test + " --> " + patt.matcher(test).matches());
		}
	}
}
