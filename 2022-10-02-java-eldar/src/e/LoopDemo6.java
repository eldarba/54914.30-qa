package e;

import java.util.Random;

public class LoopDemo6 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			int r = random.nextInt(71);
			System.out.println(r);
			sum += r;
		} 
		
		System.out.println("============");
		System.out.println(sum);
	}

}
