package homwork.b;

import java.util.Random;

public class Tar3 {

	public static void main(String[] args) {

		Random random = new Random();
		int val = random.nextInt(101);
		System.out.println(val);

		if (val < 50) {
			System.out.println("Small");
		} else {
			System.out.println("Big");
		}

		if (val % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
