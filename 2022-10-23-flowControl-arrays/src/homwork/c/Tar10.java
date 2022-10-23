package homwork.c;

public class Tar10 {

	public static void main(String[] args) {

		lbl: for (int i = 1; i <= 1000; i++) {

			// 1. check if divides by 7
			if (i % 7 == 0) {
				System.out.println("BOOM");
				continue; // go on to the next number
			}

			// 2. check if contains 7
			int copy = i;
			while (copy != 0) {
				if (copy % 10 == 7) {
					System.out.println("BOOM");
					continue lbl; // go on to the next number
				}
				copy /= 10;
			}

			// print the number as is
			System.out.println(i);
		}

	}

}
