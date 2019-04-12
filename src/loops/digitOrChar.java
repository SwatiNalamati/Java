package loops;

import java.util.Scanner;

public class digitOrChar {

	static void checkValue(char c) {

		if (c >= 48 && c <= 57) {
			System.out.println("Entered value is digit");
		}

		if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {
			System.out.println("Entered value is character");
		}

		if (c >= 33 && c <= 47 || c >= 55 && c <= 64 || c >= 123 && c <= 126) {
			System.out.println("Entered value is special character");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter value: ");
		Scanner s = new Scanner(System.in);

		String string = s.next();
		char c = string.charAt(0);

		checkValue(c);
	}

}
