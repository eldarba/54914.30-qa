package c.dimensions;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][6];
		
		arr[2][1] = 3;
		arr[1][4] = 7;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		

	}

}
