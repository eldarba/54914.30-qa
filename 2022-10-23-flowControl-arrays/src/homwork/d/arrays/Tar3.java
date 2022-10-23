package homwork.d.arrays;

import java.util.Arrays;
import java.util.Random;

public class Tar3 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[10];
		int[] tempArr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1, 10);
			tempArr[i] = -1;
		}

		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			tempArr[arr[i]] = arr[i];
		}
	//	System.out.println(Arrays.toString(tempArr));

		int length = 0;
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] != -1) {
				length++;
			}
		}

		int[] arrUniqe = new int[length];
		int ind = 0;
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] != -1) {
				arrUniqe[ind] = tempArr[i];
				ind++;
			}
		}
		System.out.println(Arrays.toString(arrUniqe));

	}

}
