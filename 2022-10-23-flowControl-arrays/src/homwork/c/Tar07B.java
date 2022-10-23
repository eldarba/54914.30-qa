package homwork.c;

import java.util.Random;

public class Tar07B {

	public static void main(String[] args) {
		
		Random random = new Random();
		int n = random.nextInt(20);
		n = 5;
		System.out.print(n + "! = ");
		
		long factorial = 1;
		int kofel = 1;
		for(; kofel < n; kofel++) {
			System.out.print(kofel + " * ");
			factorial = factorial * kofel;
		}
		factorial = factorial * kofel;
		System.out.print(kofel);
		
		System.out.println(" = " + factorial);
	}

}
