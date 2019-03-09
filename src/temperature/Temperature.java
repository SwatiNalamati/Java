package temperature;

import java.util.Scanner;

public class Temperature {
	static Scanner s = new Scanner(System.in);

	static int fahrenheit(float temp) {

		int convertCal = (int) ((temp - 32) * 0.5556f);
		return convertCal;

	}

	static float celsuis(int temp) {

		float convertCal = ((temp * 1.8f) + 32);
		return convertCal;

	}

	static void calc() {

		System.out.println("Enter a 'f' for fahrenheit to celsius");
		System.out.println("Enter a 'c' for celsius to fahrenheit ");

		String string = s.next().toLowerCase();

		if (string.equals("f")) {
			System.out.println("Enter a fahrenheit value to convert to celsius");

			System.out.println("Note:");
			System.out.println("Take fahrenheit as float value");

			float temp = s.nextFloat();

			int tresult = fahrenheit(temp);

			System.out.println(tresult);

		}

		else if (string.equals("c")) {
			System.out.println("Enter a celsius value to convert to fahrenheit");

			System.out.println("Note:");
			System.out.println("Take celsius as int value");

			int temp = s.nextInt();

			float cresult = celsuis(temp);

			System.out.println(cresult);

		}

	}

	public static void main(String[] args) {
		calc();
	}

}
