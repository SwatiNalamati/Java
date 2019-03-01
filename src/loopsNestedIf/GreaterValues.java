package loopsNestedIf;

import java.util.Scanner;

public class GreaterValues {

	static void compareValues(int a, int b, int c, int d) {

		if (a == b) {

			if (c > a && d > a) {

				if (d > c) {

					System.out.println("a==b are equal" + '\n' + "c and d values are greater than a and b" + '\n'
							+ "d is greater than c");

				}

			}

		}

		if (a == b) {

			if (a > c && a > d) {

				if (c > b) {

					System.out.print("a and b are equal" + '\n' + "c and d values are greater than a and b" + '\n'
							+ "d is greater than c");

				}

			}
		}
		if (a == b) {

			if (a > c && a > d) {

				if (c > b) {

					System.out.print("a and b are not equal");

				}

			}
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a: ");

		int a = s.nextInt();

		System.out.println("Enter b: ");

		int b = s.nextInt();

		System.out.println("Enter c: ");

		int c = s.nextInt();

		System.out.println("Enter d: ");

		int d = s.nextInt();

		compareValues(a, b, c, d);

	}

}
