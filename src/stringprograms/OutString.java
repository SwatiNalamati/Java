package stringprograms;

import java.util.Scanner;

public class OutString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter outward");

		String outword = s.next();

		System.out.println("Enter inward");
		String inword = s.next();

		String newword = newString(outword, inword);

		System.out.println(newword);

	}

	public static String newString(String out, String in) {

		String left = out.substring(0, 2);

		String right = out.substring(2);

		String newword = left + in + right;

		return newword;

	}
}
