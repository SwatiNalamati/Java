package stringprograms;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter String");

		String str = s.nextLine();

		System.out.println("Enter String to be replaced");

		String tobereplaced = s.next();

		System.out.println("Enter after string");

		String replacedstring = s.next();

		if (str.contains(tobereplaced)) {

			System.out.println(replacestring(str, tobereplaced, replacedstring));
		} else
			System.out.println("Word or String is not found");

	}

	static String replacestring(String str, String tobereplaced, String replacedstring) {

		String afterReplace = str.replace(tobereplaced, replacedstring);

		return afterReplace;

	}
}
