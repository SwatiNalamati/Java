package Set2;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {

		System.out.println("Enter number of subjects: ");
		System.out.println("Enter subject a: ");
		System.out.println("Enter subject b:  ");
		System.out.println("Enter subject c: ");
		System.out.println("Enter subject d: ");
		System.out.println("Enter subject e: ");

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();

		int total = a + b + c + d + e;
		int average = total / num;
		if (average > 35) {
			System.out.println("student passed the examinations");
		}

		else {
			System.out.println("Student will fail");

		}

	}
}
