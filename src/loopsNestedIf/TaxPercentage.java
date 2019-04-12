package loopsNestedIf;

import java.util.Scanner;

public class TaxPercentage {

	static String percentage(int age, int income) {

		if (age <= 60) {

			if (income < 250000) {

				return "0%";
			}

			else if (income >= 250000 && income <= 500000)

			{
				return ("0.1 %");
			}

			else if (income >= 500000 && income <= 1000000)

			{
				return ("0.2 %");
			}

			else if (income >= 1000000) {
				return ("0.3 %");
			}
		}

		if (age >= 60 && age <= 80)

		{
			if (income <= 300000) {
				return ("0%");
			}

			else if (income >= 300000 && income <= 500000) {
				return ("0.1%");
			}

			else if (income >= 500000 && income <= 1000000)

			{
				return ("0.2%");
			}

			else if (income >= 1000000)

			{
				return ("0.3%");
			}
		}

		if (age > 80) {

			if (income <= 500000) {
				return ("0%");
			}

			else if (income >= 500000 && income <= 1000000) {

				return ("0.2%");
			}

		}

		return null;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter age");
		int age = scanner.nextInt();

		System.out.println("Enter income");
		int income = scanner.nextInt();

		System.out.println(percentage(age, income));

		// ---method calling and will print the value that it returns

	}

}
