package programsSwitch;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter alphabet: ");

		String alphabet = s.nextLine();
		if (alphabet.equalsIgnoreCase("a") || alphabet.equalsIgnoreCase("e") || alphabet.equalsIgnoreCase("i")
				|| alphabet.equalsIgnoreCase("o") || alphabet.equalsIgnoreCase("u")) {

			checkVowelOrConsonant(alphabet);
		} else
			System.out.println("alphabet entered is consonant");

	}

	static String checkVowelOrConsonant(String alphabet) {

		switch (alphabet) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("alphabet entered is vowel");
			break;

		}

		return alphabet;

	}
}
