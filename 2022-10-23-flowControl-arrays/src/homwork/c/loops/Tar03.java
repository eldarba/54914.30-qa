package homwork.c.loops;

import java.util.Random;

public class Tar03 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int max = random.nextInt(101);
		System.out.println(max);
		System.out.println("===================");
		
		for (int c = 0; c <= max; c += 2) {
			System.out.println(c);
		}

	}

}
