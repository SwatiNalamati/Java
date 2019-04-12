package stringprograms;

import java.util.Scanner;

public class OmitFirst {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter first string: ");

		String firstString = s.next();

		System.out.println("Enter second string: ");

		String secondString = s.next();

		System.out.println(omitstring(firstString, secondString));

	}

	static String omitstring(String firstString, String secondString) {

		String ignoreFirstCharFirstString = firstString.substring(1);
		String ignoreFirstCharSecondString = secondString.substring(1);

		return ignoreFirstCharFirstString + ignoreFirstCharSecondString;

	}

}
