package loops;

import java.util.Scanner;

public class Grade {
	static void PercentageAndGrade(int a, int b, int c, int d, int e) {

		int total = a + b + c + d + e;
		int percentage = (total * 100) / 500;
		System.out.println("Percentage is: " + percentage);

		if (percentage > 90) {
			System.out.println("Grade A");
		}

		else if (percentage > 80 && percentage < 90) {
			System.out.println("Grade B");

		} else {
			System.out.println("Grade C");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter marks of  5 subjects: ");

		Scanner s = new Scanner(System.in);

		System.out.println("Enter subject a: ");
		int a = s.nextInt();

		System.out.println("Enter subject b: ");
		int b = s.nextInt();

		System.out.println("Enter subject c: ");
		int c = s.nextInt();

		System.out.println("Enter subject d: ");
		int d = s.nextInt();

		System.out.println("Enter subject e: ");
		int e = s.nextInt();

		PercentageAndGrade(a, b, c, d, e);
	}

}
