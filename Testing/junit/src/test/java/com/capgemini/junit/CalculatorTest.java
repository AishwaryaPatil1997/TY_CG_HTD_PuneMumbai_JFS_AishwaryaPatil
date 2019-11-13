package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculator = null;
	
	@BeforeEach
	public void createObject() {
		calculator = new Calculator();
	}
	
	@Test
	public void addTestForPositive() {
		int i = calculator.add(10, 5);
		assertEquals(15, i);
	}
	
	@Test
	public void addTestForNegative() {
		int i = calculator.add(-10, 5);
		assertEquals(-5, i);
	}
	
	@Test
	public void subTest() {
		int i = calculator.sub(10, 5);
		assertEquals(5, i);
	}
	
	@Test
	public void mulTest() {
		int i = calculator.mul(10, 5);
		assertEquals(50, i);
	}
	
	@Test
	public void divTest() {
		int i = calculator.div(10, 5);
		assertEquals(2, i);
	}
	
	@Test
	public void divTestByZero() {
		assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
	}
	
	@Test
	public void factTestForPositive() {
		int i = calculator.fact(5);
		assertEquals(120, i);
	}

	@Test
	public void factTestForZero() {
		int i = calculator.fact(0);
		assertEquals(1, i);
	}
	
	@Test
	public void factTestForNegative() {
		int i = calculator.fact(-5);
		assertEquals(1, i);
	}
}
