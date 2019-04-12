package loopsNestedIf;

import java.util.Scanner;

public class CompareValues {

	static void compareDigits(int a, int b, int c, int d) {

		if (a == b && b == c && c == d) {

			System.out.println("all values are equal");
		}

		if (a > b && b > c && c > d) {

			System.out.println("a is greater");
		}

		if (a == b && b > c && b > d) {
			System.out.println("b is greater");

			System.out.println("a and b values are equal");
		}

		if (a == b && b < c && b < d) {

			System.out.println("a is maximum");
			System.out.println(" a and b values are equal");
		}

		if (a < b && b < c && c < d) {

			System.out.println("a is greater");
		}

		else {
			System.out.println("all values are different");
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

		compareDigits(a, b, c, d);
	}

}
