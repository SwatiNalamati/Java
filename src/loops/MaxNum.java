package loops;

import java.util.Scanner;

public class MaxNum {

	static void greaterValue(int a, int b, int c) {
		if (a > b && a > c) {

			System.out.println("a is greater: " + a);
		} else if (b > c) {

			System.out.println("b is greater: " + b);

		} else {
			System.out.println("c is greater " + c);
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

		greaterValue(a, b, c);

	}
}