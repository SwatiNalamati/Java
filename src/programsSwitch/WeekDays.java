package programsSwitch;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter weekday number: ");

		int number = s.nextInt();

		String str = null;

		if (number >= 0 && number <= 6) {

			weekdayNum(number, str);
		} else
			System.out.println("invalid day");

	}

	static String weekdayNum(int number, String str) {

		switch (number) {
		case 0:
			str = "Sunday";
			System.out.println(str);
			break;

		case 1:
			str = "Monday";
			System.out.println(str);
			break;

		case 2:
			str = "Tuesday";
			System.out.println(str);
			break;

		case 3:
			str = "Wednesday";
			System.out.println(str);
			break;

		case 4:
			str = "Thursday";
			System.out.println(str);
			break;

		case 5:
			str = "Friday";
			System.out.println(str);
			break;

		case 6:

			str = "Saturday";
			System.out.println(str);
			break;

		}
		return str;

	}

}
