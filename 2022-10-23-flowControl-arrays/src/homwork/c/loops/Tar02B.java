package homwork.c.loops;

import java.util.Random;

public class Tar02B {

	public static void main(String[] args) {

		Random random = new Random();

		int a = random.nextInt(101);
		int b = random.nextInt(101);
		System.out.println(a + ", " + b);

		int inc = a < b ? 1 : -1;

		while (a != b) {
			System.out.println(a);
			a += inc;
		}
		System.out.println(a);

	}

}
