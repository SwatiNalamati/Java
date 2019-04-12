package loops;

import java.util.Scanner;

public class CalSal {

	static void SalCal(int basicSal) {

		if (basicSal <= 10000) {

			int GrossSal = basicSal + ((basicSal * 20) / 100) + ((basicSal * 80) / 100);
			System.out.println("Gross Salary of Emploee is: " + GrossSal);
		}

		else if (basicSal <= 20000) {
			int GrossSal = basicSal + ((basicSal * 25) / 100) + ((basicSal * 90) / 100);
			System.out.println("Gross Salary of Emploee is: " + GrossSal);
		}

		else if (basicSal > 20000) {
			int GrossSal = basicSal + ((basicSal * 30) / 100) + ((basicSal * 95) / 100);
			System.out.println("Gross Salary of Emploee is: " + GrossSal);
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		int basicSal = s.nextInt();

		SalCal(basicSal);
	}

}
