package homwork.b;

import java.util.Random;

public class Tar5B {

	public static void main(String[] args) {

		Random random = new Random();

		int a = random.nextInt(11);
		int b = random.nextInt(11);
		int c = random.nextInt(11);

		System.out.println(a + ", " + b + ", " + c);

		if (a > b && a > c) {
			System.out.println(a);
		} else {
			System.out.println(b > c ? b : c);
		}
	}

}
