package c;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		// input from a String
		Scanner sc = new Scanner("aaa bbb ccc");
		System.out.println(sc.nextLine());
		sc.close();

	}

}
