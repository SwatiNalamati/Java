package loops;

import java.util.Scanner;

public class numDays {

	static void monthNum(int i) {
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
			System.out.println("Entered month has 31 days");

		} else if (i == 4 || i == 6 || i == 9 || i == 11) {
			System.out.println("Entered month has 30 days");

		} else {
			System.out.println("Entered month has 28 days");
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter month number: ");

		Scanner s = new Scanner(System.in);

		int i = s.nextInt();

		monthNum(i);
	}

}
