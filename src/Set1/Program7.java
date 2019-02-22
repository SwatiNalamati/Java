package Set1;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		System.out.println("Enter time less than 12:  ");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println("Enter time 12 to 18:  ");
		int b = sc.nextInt();

		System.out.println("Enter time 18 to 24:  ");
		int c = sc.nextInt();

		if (a < 12) {

			System.out.println("Good Morning");

		}

		if (b > 12 && b < 24) {
			System.out.println("Good after noon");

		}

		if (c > 18 && c < 24) {
			System.out.println("Good night");

		}
		// else {
		//
		// System.out.println("Negative number");
		//
		// }

	}

}
