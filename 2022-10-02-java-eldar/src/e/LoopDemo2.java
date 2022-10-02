package e;

import java.util.Scanner;

public class LoopDemo2 {

	public static void main(String[] args) {

		int password = 123;

		System.out.println("Enter  password");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		while (input != password) {
			System.out.println("Enter  password");
			input = sc.nextInt();
		}

		System.out.println("You are logged in");
		sc.close();

	}

}
