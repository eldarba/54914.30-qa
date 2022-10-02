package b;

import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {
		// create a random number in the range 25 - 30
		Random random = new Random();
		int x = random.nextInt(25, 31);
		System.out.println(x);
	}

}
