package Set1;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		System.out.println("Enter first number a: ");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println("Enter second number b: ");
		int b = sc.nextInt();

		System.out.println("Enter third number c: ");
		int c = sc.nextInt();

		if (a > 0) {

			System.out.println("Positive number");

		}

		if (b < 0) {
			System.out.println("Negative number");

		}

		if (c == 0) {
			System.out.println("Zero");

		}
		// else {
		//
		// System.out.println("Negative number");
		//
		// }

	}

}
