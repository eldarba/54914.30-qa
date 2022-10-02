package d;

import java.util.Random;

public class FlowControll {

	public static void main(String[] args) {
		
		Random r = new Random();
		int x = r.nextInt(11); // 0 - 10
		System.out.println(x);
		
		if(x >= 5) {
			System.out.println("Big");
		}
		

	}

}
