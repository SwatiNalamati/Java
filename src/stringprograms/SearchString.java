package stringprograms;

import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter String");

		String str = s.nextLine();

		System.out.println("Enter String to be deleted");

		String strdel = s.next();
		if (str.contains(strdel)) {

			System.out.println(deletestr(str, strdel));
		} else
			System.out.println("Word or String is not found");

	}

	static String deletestr(String name, String strdel) {

		int indexNo = name.indexOf(strdel);

		String delstr = name.substring(0, indexNo) + name.substring(indexNo + strdel.length());

		return delstr;
	}

}
