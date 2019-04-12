package loops;

import java.util.Scanner;

public class ticketCostMetro {

	static void ticketCost(String string) {

		if (string.equals("Miyapur to JNTU")) {
			System.out.println("Cost of ticket is 10");
		}

		if (string.equals("Miyapur to KPHB")) {
			System.out.println("Cost of ticket is 20");
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter station and destination: ");

		String string = s.nextLine();

		ticketCost(string);
	}

}
