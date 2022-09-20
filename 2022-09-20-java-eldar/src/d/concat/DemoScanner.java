package d.concat;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {

		// create a Scanner object and call it sc
		Scanner sc = new Scanner("aaa bbb ccc 10");

		String token1 = sc.next();
		String token2 = sc.next();
		String token3 = sc.next();
		int number = sc.nextInt();

		System.out.println(token1);
		System.out.println(token2);
		System.out.println(token3);
		System.out.println(number);
		System.out.println(number * 2);

		sc.close();
	}

}
