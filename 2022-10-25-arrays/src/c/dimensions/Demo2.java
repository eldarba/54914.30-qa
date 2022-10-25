package c.dimensions;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {

		int[][] arr = { { 2, 4, 6 }, { 10, 20, 30 }, { 100, 200 } };

		// 1. print using loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		} 
		System.out.println("===================");

		// 2. print using deep toString
		String str = Arrays.deepToString(arr);
		System.out.println(str);
	}

}
