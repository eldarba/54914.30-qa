package homwork.c;

import java.util.Random;

public class Tar06 {

	public static void main(String[] args) {

		Random random = new Random();
		int x = random.nextInt(100_001);
		int copyX = x;
		int y = 0;
		
		while (x != 0) {
			y *= 10;
			y += x % 10;
			x = x / 10;
		}
		
		x = copyX;
		System.out.println(x);
		System.out.println(y);
		
		if(x == y) {
			System.out.println(x + " is palindrom");
		}else {
			System.out.println(x + " is NOT palindrom");
		}

	}

}
