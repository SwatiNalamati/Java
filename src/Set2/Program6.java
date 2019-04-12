package Set2;

import java.util.Scanner;

public class Program6 {

	static void aplhaOrNumber(char c) {

		if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {
			System.out.println("Entered value is alphabet");
		} else if (c >= 48 && c <= 57) {
			System.out.println("Entered value is digit");
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter value");

		Scanner s = new Scanner(System.in);

		String string = s.next();
		char c = string.charAt(0);

		aplhaOrNumber(c);

	}

}
