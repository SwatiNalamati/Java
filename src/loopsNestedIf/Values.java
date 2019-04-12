package loopsNestedIf;

import java.util.Scanner;

public class Values {

	static void checkValues(int a, int b) {

		if (a != b) {

			System.out.println("a is not equal to b ");

			if (a > b) {
				System.out.println("a is greter than b");

			}

			if (a < b) {

				System.out.println("b is greater than a");
			}
		} else {
			System.out.println("a is equal to b");
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a");
		int a = s.nextInt();

		System.out.println("Enter b");
		int b = s.nextInt();

		checkValues(a, b);
	}

}
