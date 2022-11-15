package app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import app.core.Calculator;

class Demo1 {

	Calculator c = new Calculator();

	@Test
	void testCalculatorSum() {
		int sum = c.sum(30, 20);

		int expeted = 50;
		int actual = sum;
		String message = "Error - sum is incorrect";
		assertEquals(expeted, actual, message);
		System.out.println("end of test 1");
	}

	@Test
	void testCalculatorMul() {
		int res = c.mul(3, 6);
		int expected = 18;
		int actual = res;
		String message = "Error - multiplication result is incorrect";
		assertEquals(expected, actual, message);
		System.out.println("end of test 2");
	}

}
