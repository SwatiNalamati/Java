package stringprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter String");

		String str = s.next();

		System.out.println(revString(str));
	}

	static String revString(String str) {

		String string1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			string1 = string1 + str.charAt(i);
			// string1 = str.charAt(i) + string1;
		}
		return string1;

	}
}
