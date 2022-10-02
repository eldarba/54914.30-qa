package c;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {

		// input from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("enter full name");
		String fullName = sc.nextLine();
		System.out.println("Hello " + fullName);

		sc.close();

	}

}
