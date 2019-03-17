package returnPrograms;

import java.util.Scanner;

public class NearestNumber {

	static int nearestNo(int a, int b) {

		int c = 10 - a;
		int d = 10 - b;

		if (d < c) {

			return a;

		}
		if (d > c) {

			return b;

		} else if (c == d) {

			System.out.println(0);

		}
		return 0;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a: ");
		System.out.println("Enter b: ");

		int a = s.nextInt();
		int b = s.nextInt();

		int nearValue = nearestNo(a, b);
		System.out.println(nearValue);

	}

}
