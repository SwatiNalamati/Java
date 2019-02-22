package Set2;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		System.out.println("Enter age: ");

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if (a < 18) {
			System.out.println("Person is not eligible for government job");
		}

		else if (a < 35 && a > 18) {
			System.out.println("Person is eligible for government job");
		}

		else {
			System.out.println("Your age is expired for applying the government job");

		}

	}
}
