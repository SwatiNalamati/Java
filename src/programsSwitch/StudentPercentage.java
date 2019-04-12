package programsSwitch;

import java.util.Scanner;

public class StudentPercentage {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter 5 subject marks");

		int sub1 = s.nextInt();
		int sub2 = s.nextInt();
		int sub3 = s.nextInt();
		int sub4 = s.nextInt();
		int sub5 = s.nextInt();

		int percentage = ((sub1 + sub2 + sub3 + sub4 + sub5) / 500) * 100;

		calgrade(sub1, sub2, sub3, sub4, sub5, percentage);
	}

	static void calgrade(int sub1, int sub2, int sub3, int sub4, int sub5, int percentage) {

		switch (percentage) {

		case 90:
			System.out.println(percentage + "A grade");

			break;

		case 40:
			System.out.println(percentage + "and improve study");

			break;
		}

	}

}
