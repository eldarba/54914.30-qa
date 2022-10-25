package d.bounds;

public class Demo1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		// 0 - 3
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		// out of bounds
		System.out.println(arr[8]);

	}

}
