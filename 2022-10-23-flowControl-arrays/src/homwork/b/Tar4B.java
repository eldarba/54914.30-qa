package homwork.b;

import java.util.Random;

public class Tar4B {

	public static void main(String[] args) {

		Random random = new Random();
		
		double salary = random.nextDouble(5000, 6001);
		System.out.println(salary);

		double newSalary = salary * 1.1 <= 6000 ? salary * 1.1 : 6000;
		System.out.println(newSalary);

	}

}
