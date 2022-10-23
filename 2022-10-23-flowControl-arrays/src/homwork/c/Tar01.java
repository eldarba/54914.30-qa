package homwork.c;

import java.util.Random;

public class Tar01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int x = random.nextInt(101);
		
		System.out.println(x);
		System.out.println("===========");

		for (int c = 0; c <= x; c++) {
			System.out.println(c);
		}

	}

}
