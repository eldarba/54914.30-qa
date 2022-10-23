package homwork.c.loops;

import java.util.Random;

public class Tar07 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int n = random.nextInt(21);
		// n = 5;
		
		long factorial = 1;
		
		for(int kofel = 1; kofel <= n; kofel++) {
			factorial = factorial * kofel;
		}
		
		System.out.println(n + "! = " + factorial);
	}

}
