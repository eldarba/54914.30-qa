package homwork.c;

import java.util.Random;

public class Tar09 {

	public static void main(String[] args) {
		Random random = new Random();
		int value = random.nextInt(1, 51);
		System.out.println("value is " + value);

		int f1 = 1;
		int f2 = 1;

		while (f1 <= value) {
			System.out.print(f1 + ", ");
			int temp = f1;
			f1 = f2;
			f2 = temp + f2;
		}

	}

}
