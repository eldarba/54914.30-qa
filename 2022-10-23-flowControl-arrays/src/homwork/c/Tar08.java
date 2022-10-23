package homwork.c;

import java.util.Random;

public class Tar08 {

	public static void main(String[] args) {
		Random random = new Random();
		int index = random.nextInt(1, 51);
		 index = 2;
		System.out.println("fibonaci at index " + index + " is");

		long f1 = 1;
		long f2 = 1;

		for (int i = 3; i <= index; i++) {
			long temp = f1;
			f1 = f2;
			f2 = temp + f2;
		}

		System.out.println(f2);
	} 

}
