package b;

import java.util.Arrays;

public class Demo2CopyArray {

	public static void main(String[] args) {
		
		int[] arr1 = { 2, 4, 6, 8};
		int[] arr2 = new int[arr1.length + 2];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		arr2[arr1.length] = 100;
		arr2[arr1.length + 1] = 200;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2)); 

	}

}
