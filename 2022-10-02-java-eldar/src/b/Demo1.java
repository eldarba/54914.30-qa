package b;

import java.util.Random;

public class Demo1 {

	public static void main(String[] args) {
		
		// CREATE A RANDOM NUMBER IN THE RANGE 0 - 10
		
		// 1. create an object for generating random numbers
		Random r = new Random();
		
		// 2. get a random number from the object
		int x = r.nextInt(11);
		System.out.println(x);
		

	}

}
