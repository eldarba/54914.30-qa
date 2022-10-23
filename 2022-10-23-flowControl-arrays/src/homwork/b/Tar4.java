package homwork.b;

import java.util.Random;

public class Tar4 {

	public static void main(String[] args) {

		Random random = new Random();
		// == random char ============================
//		char c = (char)random.nextInt((int)'A', (int)'Z'+1);
//		System.out.println(c);
		// ============================================
// 		java 17 and up
		double salary = random.nextDouble(5000, 6001);

// 		java below 17
//		double salary = random.nextDouble(1001) + 5000;

		System.out.println(salary);

		double newSalary = salary * 1.1;
		if (newSalary > 6000) {
			newSalary = 6000;
		}
		System.out.println(newSalary);

	}

}
