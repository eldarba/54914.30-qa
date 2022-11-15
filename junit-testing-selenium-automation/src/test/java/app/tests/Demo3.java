package app.tests;

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
	void testAll() {

		TestAdd testAdd = new TestAdd();
		testAdd.test(calculator);

		TestSub testSub = new TestSub();
		testSub.test(calculator);

		// homework
		// add test multiply - a unit test class
		// add test divide - a unit test class
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
