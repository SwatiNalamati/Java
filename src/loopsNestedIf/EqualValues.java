package loopsNestedIf;

import java.util.Scanner;

public class EqualValues {

	static void equalValues(int a, int b, int c, int d) {

		if (a == b && b == c && c == d) {

			System.out.println("all values are equal");
		}

		else if (a == b && b != c && c != d && a == d) {
			System.out.println("a, b and d are equal");
		}

		else if (a != b && b == c && c == d) {
			System.out.println("b, c and d are equal");
		}

		// else if(a == b && b != c && c != d && a==d)

	}

	// else{
	// System.out.println("not equal");

	// }

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 4 values");
		int Value1 = scanner.nextInt();
		int Value2 = scanner.nextInt();
		int Value3 = scanner.nextInt();
		int Value4 = scanner.nextInt();

		equalValues(Value1, Value2, Value3, Value4);
	}

}
