package loopsNestedIf;

import java.util.Scanner;

public class Credentials {

	static void creds(String uname, String pwd)

	{

		if (uname.equals("admin")) {

			if (pwd.equals("123")) {

				System.out.println("Login successfully");

			}

		}

		if (uname.equals("admin")) {

			if (pwd.equals("1234")) {

				System.out.println("Password is incorrect. Please check once");

			}

			if (uname.equals("admina")) {

				if (pwd.equals("123")) {

					System.out.println("Username is incorrect. Please check once");

				}

			}
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter username");

		String uname = s.next();

		System.out.println("Enter password");

		String pwd = s.next();

		creds(uname, pwd);

	}

}
