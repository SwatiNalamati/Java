package returnPrograms;

import java.util.Scanner;

public class SameLastDigit {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter 2 integer values: ");

		int a = s.nextInt();
		int b = s.nextInt();

		boolean result = lastDigits(a, b);
		System.out.println(result);

	}

	static boolean lastDigits(int a, int b) {

		if (b % 10 == a)

		{
			return true;
		}

		else if (a % 10 == b) {

			return true;
		}

		return false;

	}
}
