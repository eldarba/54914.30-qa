package homwork.a;

import java.util.Random;

public class Tar2 {

	public static void main(String[] args) {

		Random random = new Random();

		int a = random.nextInt(101);
		int b = random.nextInt(101);

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int sum = a + b;
		System.out.println("sum = " + sum);

		double avg = sum / 2D;
		System.out.println("avg = " + avg);

		int rem1 = a % 10;
		int rem2 = b % 10;
		System.out.println(rem1);
		System.out.println(rem2);
		
		int p = 2*(a + b);
		int area = a * b;
		System.out.println("perimeter: " + p);
		System.out.println("area: " + area);

	}

}
