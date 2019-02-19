package Java;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {

		System.out.println("Enter first number a: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println("Enter second number b: ");
		int b = sc.nextInt();

		System.out.println("Enter third" + " number c: ");
		int c = sc.nextInt();

		int d = (a + b + c) / 3;

		System.out.println("Average of numbers is: " + d);

	}

}
