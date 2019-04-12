package Set2;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter value: ");

		String a = s.next();
		char c = a.charAt(0);

		// System.out.println((char) a);

		if (c >= 48 && c <= 57) {
			System.out.println("Number");

		} else {
			System.out.println("String");

			// Ascii numbers range is 48 to 57
			// lower case alphabets 97 to 122
			// upper case alphabets 65 to 90

			// if (a != 0) {
			//
			// System.out.println("Number");
			//
			// } else
			//
			// System.out.println("String");

		}

	}
}
