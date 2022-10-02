package b;

import java.util.Random;

public class Demo3 {

	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(101);
		int b = r.nextInt(102);

		// add
		System.out.println(a + " + " + b + " = " + (a + b));
		// sub
		System.out.println(a + " - " + b + " = " + (a - b));
		// mul
		System.out.println(a + " * " + b + " = " + (a * b));
		// div
		System.out.println(a + " / " + b + " = " + (a / b) + " rem: " + (a % b));

	}

}
