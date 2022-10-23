package homwork.b;

import java.util.Scanner;

public class Tar6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("enter salary: ");
		double sal = scanner.nextDouble();
		scanner.close();
		double tax = 0;

		if (sal <= 23_000) {
			tax = sal * 0.1;
		} else {
			tax = 23_000 * 0.1; // grade 1 whole
			if (sal <= 50_000) {
				tax += (sal - 23_000) * 0.2;
			} else {
				tax += (50_000 - 23_000) * 0.2; // grade 2 whole
				if (sal <= 100_000) {
					tax += (sal - 50_000) * 0.3;
				} else {
					tax += (100_000 - 50_000) * 0.3; // grade 3 whole
					tax += (sal - 100_000) * 0.4;
				}
			}
		}

		System.out.println("salary: " + sal);
		System.out.println("tax: " + tax);
		System.out.println("net salary: " + (sal - tax));
	} 

}
