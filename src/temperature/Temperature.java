package temperature;

import java.util.Scanner;

public class Temperature {
	static Scanner s = new Scanner(System.in);

	static float fahrenheit(float temp) {

		float convertCal = (float) ((temp - 32) * 0.5556);
		return convertCal;

	}

	static int celsuis(int temp) {

		int convertCal = (int) ((temp * 0.5556) + 32);
		return convertCal;

	}

	static void calc() {

		System.out.println("Enter a 'f' for fahrenheit to celsius");
		System.out.println("Enter a 'c' for celsius to fahrenheit ");

		String f = s.next().toLowerCase();
		String c = s.next().toLowerCase();

		if (f.equals("f")) {
			System.out.println("Enter a fahrenheit value to convert to celsius");

			System.out.println("Note:" + "/n" + "Take fahrenheit as float value");
			float temp = Float.parseFloat(f);

			fahrenheit(temp);

		}

		if (c.equals("c")) {
			System.out.println("Enter a celsius value to convert to fahrenheit");

			System.out.println("Note:" + "/n" + "Take celsius as int value");
			int temp = Integer.parseInt(c);

			celsuis(temp);

		}

	}

	public static void main(String[] args) {
		calc();
	}

}
