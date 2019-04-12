package programsSwitch;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number1");

		int a = s.nextInt();

		System.out.println("Enter number2");

		int b = s.nextInt();

		System.out.println("Enter any operation from below");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");

		String str = s.next();

		calc(str, a, b);
	}

	static int calc(String str, int a, int b) {

		int c = 0;

		switch (str) {
		case "+":

			c = a + b;

			System.out.println(c);
			break;

		case "-":

			c = b - a;

			System.out.println(c);
			break;

		case "*":

			c = a * b;

			System.out.println(c);
			break;

		case "/":

			c = a / b;

			System.out.println(c);
			break;
		}
		return c;

	}
}
