package app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.core.AdvancedCalculator;

class Demo3 {

	static AdvancedCalculator calculator;

	@BeforeAll
	static void before() {
		System.out.println("======> before all");
		calculator = new AdvancedCalculator();
		calculator.add(2);
		System.out.println("calculator is ready");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("==> before each");
		calculator.clear();
	}

	@Test
	void testAdd() {
		System.out.println("== test add");
		calculator.add(5); // 5
		calculator.add(3); // 8
		calculator.add(10); // 18
		assertEquals(18, calculator.getResult());
	}

	@Test
	void testSub() {
		System.out.println("== test subtract");
		calculator.sub(3); // -3
		calculator.sub(2.5); // -5.5
		assertEquals(-5.5, calculator.getResult());
	}

	@AfterEach
	void afterEach() {
		System.out.println("==> after each");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("======> after all");
		System.out.println("calculator turned off");
	}
}
