package returnPrograms;

import java.util.Scanner;

public class Multiple3or5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number: ");

		int a = s.nextInt();

		boolean result = multiple(a);
		System.out.println(result);

	}

	public static boolean multiple(int a) {

		if (a % 3 == 0 || a % 5 == 0) {

			return true;
		}

		return false;

	}

}
