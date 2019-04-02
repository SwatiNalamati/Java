package stringprograms;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter string");

		String string = s.next();

		System.out.println(removecharinstring(string));

	}

	static String removecharinstring(String string) {

		String removestring = string.replace("a", "");

		return removestring;

	}
}
