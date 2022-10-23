package homwork.d.arrays;

import java.util.Arrays;
import java.util.Random;

public class Tar1 {

	public static void main(String[] args) {

		Random random = new Random();
		int[] arr = new int[10];
		int sum = 0;
		double avg;

		// populate the array with random values
		for (int i = 0; i < arr.length; i++) {
			int r = random.nextInt(101);
			arr[i] = r;
			sum += arr[i];
			System.out.print(arr[i] + ", ");
		}
		avg = sum / (double) arr.length;
		System.out.println();

		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);

	}

}
