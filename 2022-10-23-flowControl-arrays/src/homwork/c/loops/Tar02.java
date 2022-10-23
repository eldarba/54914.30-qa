package homwork.c.loops;

import java.util.Random;

public class Tar02 {

	public static void main(String[] args) {

		Random random = new Random();

		int a = random.nextInt(101);
		int b = random.nextInt(101);
		System.out.println(a + ", " + b);

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		while(a <= b) {
			System.out.println(a++);
		}

	}

}
