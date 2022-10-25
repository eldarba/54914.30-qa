package a;

import java.util.Arrays;

public class Demo6Init {
	
	public static void main(String[] args) {
		// dynamic initialization 
		int[] arr1 = new int[3];
		arr1[0] = 2;
		arr1[1] = 4;
		arr1[2] = 6;
		System.out.println(Arrays.toString(arr1));
		
		// static initialization 
		int[] arr2 = {2, 4, 6};
		System.out.println(Arrays.toString(arr2));
		
	} 

}
