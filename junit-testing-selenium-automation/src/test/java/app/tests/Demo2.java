package app.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import app.core.Calculator;

class Demo2 {

	static Calculator calculator;

	@BeforeAll
	static void before() {
		System.out.println("==> before all");
		calculator = new Calculator();
		System.out.println("calculator is ready");
	}

	@Test
	void test1() {
		System.out.println("==> starting test 1 - sum");
		Assertions.assertEquals(8, calculator.sum(5, 3), "Error: sum is incorrect");
	}

	@Test
	void test2() {
		System.out.println("==> starting test 2 - multiply");
		Assertions.assertEquals(9, calculator.mul(3, 3), "Error: multiplication is incorrect");
	}

	@AfterAll
	static void after() {
		System.out.println("==> after all");
		System.out.println("caculator turned off");
	}

}
