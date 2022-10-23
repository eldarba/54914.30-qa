package homwork.c;

import java.util.Random;

public class Tar05 {

	public static void main(String[] args) {
		Random random = new Random();

		int r = random.nextInt(10_001);
		// r = 52;
		System.out.println(r);
		int rev = 0;

		int numberOfDigits = 1;
		int sum = 0;

		while (r > 9) {
			rev = rev * 10;
			rev += r % 10;
			sum += r % 10;
			r = r / 10;
			numberOfDigits++;
		}
		sum += r;
		rev = rev * 10;
		rev += r;

		System.out.println("number of digits: " + numberOfDigits);
		System.out.println("left digit: " + r);
		System.out.println("sum of digits: " + sum);
		System.out.println("rev number: " + rev); 
	}

}
