package stringprograms;

import java.util.Scanner;

public class ReplaceX {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter string: ");

		String word = s.next();

		String newWord = replacex(word);

		System.out.println(newWord);

	}

	public static String replacex(String w) {

		if (w.startsWith("x") && w.endsWith("x")) {

			// String afterreplace = w.replaceFirst(w, "");

			String afterreplace = w.substring(1, w.length() - 1);

			return afterreplace;
		}

		else if (w.startsWith("x")) {

			// String afterreplace = w.replaceFirst(w, "");

			String afterreplace = w.substring(1);

			return afterreplace;
		}

		else if (w.endsWith("x")) {

			// String afterreplace = w.replaceFirst(w, "");

			String afterreplace = w.substring(0, w.length() - 1);

			return afterreplace;
		}

		return w;

	}
}
