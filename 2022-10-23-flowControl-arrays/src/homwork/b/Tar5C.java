package homwork.b;

import java.util.Random;

public class Tar5C {

	public static void main(String[] args) {

		Random random = new Random();

		int a = random.nextInt(11);
		int b = random.nextInt(11);
		int c = random.nextInt(11);

		System.out.println(a + ", " + b + ", " + c);

		System.out.println(a > b && a > c ? a : b > c ? b : c);
	}

}
