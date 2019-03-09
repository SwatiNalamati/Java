package difference;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number");

		int i = s.nextInt();

		if (i <= 21) {

			int difference = 21 - i;

			System.out.println(difference);

		}

		else if (i > 21) {

			int difference = 21 - i;
			int positive = Math.abs(difference);

			int result = positive * 2;

			// System.out.println(difference);
			// System.out.println(positive);
			System.out.println(result);
		}
	}

}
