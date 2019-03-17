package returnPrograms;

import java.util.Scanner;

public class Teens {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter 3 integer values: ");

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		boolean result = teens(a, b, c);
		System.out.println(result);

	}

	public static boolean teens(int a, int b, int c) {

		if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19) {

			return true;
		}
		return false;

	}

}
