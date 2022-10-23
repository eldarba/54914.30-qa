package homwork.c;

import java.util.Random;

public class Tar01B {

	public static void main(String[] args) {

		Random random = new Random();
		int x = random.nextInt(101);

		System.out.println(x);
		System.out.println("===========");

		int c = 0;
		while (c <= x) {
			System.out.println(c++);
		}

	}

}
