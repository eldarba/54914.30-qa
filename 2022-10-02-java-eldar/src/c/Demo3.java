package c;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		// input from a String
		Scanner sc = new Scanner("bread 5");
		
		String product = sc.next(); // get the product name
		int quantity = sc.nextInt(); // get the quantity
		
		System.out.println(product);
		System.out.println(quantity);
		
		sc.close();

	}

}
