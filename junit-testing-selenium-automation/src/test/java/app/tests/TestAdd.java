package app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import app.core.AdvancedCalculator;

class TestAdd {

	@Test
	void test(AdvancedCalculator calculator) {
		System.out.println("== test add");
		calculator.add(5); // 5
		calculator.add(3); // 8
		calculator.add(10); // 18
		assertEquals(18, calculator.getResult());
	}

}
