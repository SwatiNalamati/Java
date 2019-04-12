package loops;

import java.util.Scanner;

public class PrgmUpperCase {

	static void checkCases(char c) {

		if (c >= 65 && c <= 90) {

			System.out.println(c + " is upper case");
		}

		else if (c >= 97 && c <= 122) {

			System.out.println(c + " is lower case");

		} else {

			System.out.println(c + " is not a character");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter Character: ");

		Scanner s = new Scanner(System.in);

		String string = s.next();
		char p = string.charAt(0);

		checkCases(p);
	}

}
