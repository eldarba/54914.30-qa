package a;

import java.util.Arrays;
import java.util.Random;

public class Demo3 {

	public static void main(String[] args) {

		int[] grades = new int[10];
		grades[3] = 85;

		Random random = new Random();

		for (int i = 0; i < grades.length; i++) {
			grades[i] = random.nextInt(101);
		}
		
		// convert the array to String
		String str = Arrays.toString(grades);
		// print the String - to see all array elements
		System.out.println(str);
	}

}
