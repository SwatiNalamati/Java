package Set2;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {

		System.out.println("Enter number a: ");
		System.out.println("Enter number b: ");
		System.out.println("Enter number c: ");

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a == b || a == c || b == c) {
			System.out.println("Only one condition is true");
		}

		else if (a == b && a == c && b == c) {
			System.out.println("All conditions are true");
		} else if (a % b == 0 && a % c != 0) {
			System.out.println(a + " is multiplies by " + b + " and " + " not multiplied by " + c);
		}

		else {
			System.out.println(a + " is Not multiplied by both two numbers");

		}

	}
}
