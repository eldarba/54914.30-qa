package homwork.c;

import java.util.Random;

public class Tar04 {

	public static void main(String[] args) {

		Random random = new Random();

		int big = random.nextInt(101);
		int small = random.nextInt(11);

		System.out.println("Big: " + big);
		System.out.println("Small: " + small);
		
		if(small > 0) { // to prevent infinite loop
			for (int c = 0; c <= big; c += small) {
				System.out.println(c);
			}
		}else {
			System.out.println("Error: small is 0 - infinite loop");
		}


	}

}
