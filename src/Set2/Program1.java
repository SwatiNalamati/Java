package Set2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Enter number a:");

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if (a % 2 == 0) {

			System.out.println("Even Number");

		}

		else

			System.out.println("Odd Number");

	}

}
