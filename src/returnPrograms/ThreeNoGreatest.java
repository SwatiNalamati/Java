package returnPrograms;

import java.util.Scanner;

public class ThreeNoGreatest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter 3 integer values: ");
		System.out.println("Enter 4th value as true or false ");

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		String fourthvalue = s.next();

		boolean result = greatValues(a, b, c, fourthvalue);
		System.out.println(result);

	}

	public static boolean greatValues(int a, int b, int c, String fourthvalue) {

		if (fourthvalue.equals("true") && c > b)

			return true;

		else if (!fourthvalue.equals("true") && b > a && c > b) {

			return true;
		}

		return false;

	}
}
