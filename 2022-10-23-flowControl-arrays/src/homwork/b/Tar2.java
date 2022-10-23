package homwork.b;

import java.util.Random;

public class Tar2 {

	public static void main(String[] args) {

		Random random = new Random();
		int val = random.nextInt(11);
		System.out.println(val);

		if (val < 5) {
			System.out.println("Small");
		} else if (val > 5) {
			System.out.println("Big");
		} else {
			System.out.println("Bingo");
		}

	} 

}
