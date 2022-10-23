package homwork.b;

import java.util.Random;

public class Tar7 {

	public static void main(String[] args) {

		Random random = new Random();
		int year = random.nextInt(2000, 2021);

		System.out.println(year);

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("LEAP");
		} else {
			System.out.println("NOT LEAP");
		}
	}

}
