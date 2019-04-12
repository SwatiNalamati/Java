package stringprograms;

import java.util.Scanner;

public class SubStringProgram {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter string1");

		String string1 = s.next();

		System.out.println("Enter two integers: ");
		int integer1 = s.nextInt();
		int integer2 = s.nextInt();

		System.out.println(suboutput(string1, integer1, integer2));

	}

	static String suboutput(String string1, int integer1, int integer2) {

		String substring = string1.substring(3, integer2);

		return substring;

	}
}
