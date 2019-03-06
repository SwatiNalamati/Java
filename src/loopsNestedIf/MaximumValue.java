package loopsNestedIf;

import java.util.Scanner;

public class MaximumValue {
	static int firstValue, secondValue, thirdValue, fourthValue;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 4 int values");
		firstValue = scanner.nextInt();
		secondValue = scanner.nextInt();
		thirdValue = scanner.nextInt();
		fourthValue = scanner.nextInt();
		int maxValue = checkForMaxAndEqual(firstValue, secondValue, thirdValue, fourthValue);
		System.out.println("Max value: " + maxValue);
	}

	private static int checkForMaxAndEqual(int x, int y, int p, int q) {
		int total = x + y + p + q;
		int difference1 = total - x;
		int difference2 = total - y;
		int difference3 = total - p;
		int difference4 = total - q;
		// calling the checkMin method that return the min value
		int minValue = checkMin(difference1, difference2, difference3, difference4);
		// check for the all values are equal or not
		if (difference1 == difference2 && difference2 == difference4 && difference3 == difference4) {
			System.out.println("all are equal");
			return x;
		} else if (difference1 == difference2 || difference1 == difference3 || difference1 == difference4) {
			if (difference1 == difference2)
				System.out.println(x + " " + y + " are equal");
			else if (difference1 == difference3)
				System.out.println(x + " " + p + " are equal");
			else if (difference1 == difference4)
				System.out.println(x + " " + q + " are equal");
			System.out.println("Min value: " + minValue);
		} else if (difference2 == difference3 || difference2 == difference4) {
			if (difference2 == difference3)
				System.out.println(y + " " + p + " are equal");
			else if (difference2 == difference4)
				System.out.println(y + " " + q + " are equal");
			System.out.println("Min value: " + minValue);
		} else if (difference3 == difference4) {
			System.out.println(p + " " + q + " are equal");
			System.out.println("Min value: " + minValue);
		} else {
			System.out.println("all are different");
			System.out.println("Min value: " + minValue);
		}

		// return the max value
		if (difference1 <= difference2 && difference1 <= difference3 && difference1 <= difference4) {
			return x;
		} else if (difference2 <= difference1 && difference2 <= difference3 && difference2 <= difference4) {
			return y;
		} else if (difference3 <= difference1 && difference3 <= difference2 && difference3 <= difference4) {
			return p;
		} else if (difference4 <= difference1 && difference4 <= difference2 && difference4 <= difference3) {
			return q;
		}

		return 0;
	}

	static int checkMin(int difference1, int difference2, int difference3, int difference4) {
		if (difference1 > difference2 && difference1 > difference3 && difference1 > difference4) {
			return firstValue;
		} else if (difference2 >= difference1 && difference2 >= difference3 && difference2 >= difference4) {
			return secondValue;
		} else if (difference3 >= difference1 && difference3 >= difference2 && difference3 >= difference4) {
			return thirdValue;
		} else if (difference4 >= difference1 && difference4 >= difference2 && difference4 >= difference3) {
			return fourthValue;
		}
		return 0;
	}
}
