package homwork.d.arrays;

import java.util.Random;

public class Tar2 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[50];
		int max = 0;
		int ind = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(101);
			System.out.print(arr[i] + ", ");
			if(arr[i] > max) {
				max = arr[i];
				ind = i;
			}
		}
		
		System.out.println();
		System.out.println("max = " + max);
		System.out.println("ind = " + ind);
	}

}
