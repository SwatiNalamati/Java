package Java;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		System.out.println("Enter number: ");

		Scanner c = new Scanner(System.in);

		int b = c.nextInt();

		if (b % 2 != 0) {

			System.out.println("Odd Number");

		}

		else {

			System.out.println("Even Number");
		}

	}

}
