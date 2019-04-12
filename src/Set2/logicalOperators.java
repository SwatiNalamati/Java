package Set2;

import java.util.Scanner;

public class logicalOperators {

	public static void main(String[] args) {

		System.out.println("Enter number a: ");
		System.out.println("Enter number b: ");
		System.out.println("Enter number c: ");

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a == b && a == c && b == c) {
			System.out.println("Both conditions are true");
		}

		else if (a == b || a == c || b == c) {
			System.out.println("Only one condition is true");
		} else if (a == b && a == c || b == c) {

			System.out.println("All conditions are false");

		}
	}
}