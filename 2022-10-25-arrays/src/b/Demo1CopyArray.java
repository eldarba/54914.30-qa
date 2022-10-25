package b;

import java.util.Arrays;

public class Demo1CopyArray {

	public static void main(String[] args) {
		
		int[] arr1 = { 2, 4, 6, 8};
		int[] arr2 = new int[arr1.length];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2)); 

	}

}
