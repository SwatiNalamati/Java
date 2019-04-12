package calculator;

import java.util.Scanner;

public class Calculator {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		calc();

	}

	public static void calc() {

		System.out.println("Enter a number for calculation: ");

		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Modulus");
		System.out.println("5. Multiplication");

		int calnumber = s.nextInt();
		System.out.println("Enter 2 numbers: ");

		int a = s.nextInt();
		int b = s.nextInt();

		if (calnumber == 1) {

			int add = Addition(a, b);
			System.out.println(add);

		}

		else if (calnumber == 2) {

			int sub = Subtraction(a, b);
			System.out.println(sub);

		} else if (calnumber == 3) {

			int div = Division(a, b);
			System.out.println(div);

		} else if (calnumber == 4) {

			int mod = Modulus(a, b);
			System.out.println(mod);

		} else if (calnumber == 5) {

			int prod = Multiplication(a, b);
			System.out.println(prod);

		}
	}

	static int Addition(int a, int b) {

		int result = a + b;

		System.out.println(a + " + " + b + "=" + result);

		return result;

	}

	static int Subtraction(int a, int b) {

		int result = a - b;

		System.out.println(a + " - " + b + "=" + result);

		return result;

	}

	static int Division(int a, int b) {

		int result = a / b;

		System.out.println(a + " / " + b + "=" + result);

		return result;

	}

	static int Modulus(int a, int b) {

		int result = a % b;

		System.out.println(a + " % " + b + "=" + result);

		return result;

	}

	static int Multiplication(int a, int b) {

		int result = a * b;

		return result;

	}
}