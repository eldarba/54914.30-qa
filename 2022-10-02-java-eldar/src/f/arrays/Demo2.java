package f.arrays;

import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {

		int[] grades = new int[100];
		Random random = new Random();

		for (int i = 0; i <= 99; i++) {
			grades[i] = random.nextInt(101);
		}

		System.out.println("================");
		// iterate array again to print all elements
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}

	}

}
