package b;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator clac = new Calculator();

		int x = clac.addTwoNumbers(100, 30);
		System.out.println(x);

		x = clac.subtractTwoNumbers(10, 3);
		System.out.println(x); 

	}

}
