package homwork.b;

import java.util.Random;

public class Tar5 {

	public static void main(String[] args) {

		Random random = new Random();

		int a = random.nextInt(11);
		int b = random.nextInt(11);
		int c = random.nextInt(11);

		System.out.println(a + ", " + b + ", " + c);

		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
