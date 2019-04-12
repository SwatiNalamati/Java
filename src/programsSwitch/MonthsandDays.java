package programsSwitch;

import java.util.Scanner;

public class MonthsandDays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter month name");
		String month = s.next();

		if (month.equalsIgnoreCase("JAN") || month.equalsIgnoreCase("FEB") || month.equalsIgnoreCase("MAR")
				|| month.equalsIgnoreCase("APR") || month.equalsIgnoreCase("MAY") || month.equalsIgnoreCase("JUNE")
				|| month.equalsIgnoreCase("JULY") || month.equalsIgnoreCase("AUG") || month.equalsIgnoreCase("SEP")
				|| month.equalsIgnoreCase("OCT") || month.equalsIgnoreCase("NOV") || month.equalsIgnoreCase("DEC")) {

			findNoOfDays(month);

		} else
			System.out.println("Please check the input value..");

	}

	public static void findNoOfDays(String month) {

		switch (month) {
		case "JAN":
		case "MAR":
		case "MAY":
		case "JULY":
		case "AUG":
		case "OCT":
		case "DEC":

			System.out.println("31 days");
			break;

		case "APR":
		case "JUNE":
		case "SEP":
		case "NOV":

			System.out.println("30 days");
			break;

		case "FEB":

			System.out.println("28 days");
			break;

		}

	}

}
