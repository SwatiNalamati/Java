package difference;

import java.util.Scanner;

public class Difference {
	static Scanner s = new Scanner(System.in);

	static int difference(int diff) {

		System.out.println("Enter number");
		int i = s.nextInt();

		if (i <= 21) {

			diff = 21 - i;

			System.out.println(diff);

		}

		else if (i > 21) {

			diff = 21 - i;
			// int positive = Math.abs(difference);

			int positive = diff * -1;
			// negative*negative is positive
			int result = positive * 2;

			System.out.println(diff);
			System.out.println(positive);
			System.out.println(result);
		}
		return diff;

	}

	public static void main(String[] args) {
		difference(0);
		// Why 0 as parameter in difference method when its called?
	}

}
