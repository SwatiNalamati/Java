package Set2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("Enter age: ");

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if (a < 18) {

			System.out.println("Person is Minor");

		}

		else

			System.out.println("Person is Major");

	}

}
