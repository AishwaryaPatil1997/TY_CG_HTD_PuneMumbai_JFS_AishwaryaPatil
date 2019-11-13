package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	public void addTest() {
		Sum sum = new Sum();
		int i = sum.add(10, 5);
		
		assertEquals(15, i);
	}
	
	@Test
	public void addTest1() {
		Sum sum = new Sum();
		int j = sum.add1(10, 8, 12);
		
		assertEquals(30, j);
	}
	
}
