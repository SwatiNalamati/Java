package loopsNestedIf;

import java.util.Scanner;

public class Manager {

	static Scanner s = new Scanner(System.in);

	static boolean experience(int exp) {

		if (exp > 10) {

			return true;
		}

		return false;

	}

	static boolean trainings(int training) {

		if (training > 5) {

			return true;
		}

		return false;

	}

	static boolean post(String designation) {

		if (designation.equals("a")) {

			return true;
		}

		return false;

	}

	static void promotion() {

		System.out.println("Enter years of experience");
		int exp1 = s.nextInt();

		if (experience(exp1)) {

			System.out.println("Enter number of trainings received");

			int trainings1 = s.nextInt();

			if (!trainings(trainings1)) {

				System.out.println("Need more training");
			}

			System.out.println("Enter designation");

			String designation1 = s.next().toLowerCase();

			if (post(designation1)) {

				System.out.println("Qualified for promotion");
			}

			else {
				System.out.println("Become asst manager first");

			}

		}

		else {
			System.out.println("Need more experience");
		}
	}

	public static void main(String[] args) {

		promotion();

	}

}
