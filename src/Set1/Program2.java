package Set1;

import java.util.Scanner;
/*2 . Write a program to print given string dynamically while passing 1 as a parameter in if condition?
Input : Hello 
Output : Hello*/
//Not possible with java because it's not dynamic typed language

public class Program2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number");
		int i = s.nextInt();

		if (i == 1) {
			System.out.println("Hello");
		}

	}
}