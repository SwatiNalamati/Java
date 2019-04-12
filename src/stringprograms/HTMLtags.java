package stringprograms;

import java.util.Scanner;

public class HTMLtags {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter tag");

		String tag = s.next();

		System.out.println("Enter word");
		String word = s.nextLine();

		System.out.println(htmltag(tag, word));

	}

	static String htmltag(String tag1, String word1) {

		String opentag = "<" + tag1 + ">";

		String closetag = "</" + tag1 + ">";

		return opentag + word1 + closetag;

	}

}
