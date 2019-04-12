package Set2;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {

		System.out.println("Enter alphabets: ");

		Scanner s = new Scanner(System.in);
		String b = s.next().toLowerCase();
		// char c = b.charAt(0);

		if (b.equals("a") || b.equals("e") || b.equals("i") || b.equals("o") || b.equals("u")) {
			System.out.println("Vowel");

		} else
			System.out.println("Consonant");

	}
}
