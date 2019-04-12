package Set2;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		System.out.println("Enter year: ");

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if (a % 4 == 0 || a % 400 == 0) {

			System.out.println("Leap year");

		} else

			System.out.println("Not leap year");

	}

}
