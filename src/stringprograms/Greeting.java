package stringprograms;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");

		String name = s.next();

		String print = printGreeting(name);

		System.out.println(print);

	}

	static String printGreeting(String name) {

		// String greeting = ("Hello " + name + "!");
		//
		// return greeting;
		// OR
		return "Hello " + name + "!";
	}

}
