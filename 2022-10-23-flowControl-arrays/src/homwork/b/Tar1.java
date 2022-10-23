package homwork.b;

import java.util.Random;

public class Tar1 {

	public static void main(String[] args) {

		Random random = new Random();

		int a = random.nextInt(101);
		int b = random.nextInt(101);

		System.out.println(a + ", " + b);

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

		System.out.println("===================");
		// ternary operator boolean ? true : false
		System.out.println(a > b ? a : b);

	} 

}
