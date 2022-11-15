package app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import app.core.AdvancedCalculator;

class TestSub {

	@Test
	void test(AdvancedCalculator calculator) {
		System.out.println("== test subtract");
		calculator.sub(3); // -3
		calculator.sub(2.5); // -5.5
		assertEquals(-5.5, calculator.getResult());
	}

}
