package com.capgemini.seleniumdemo.one;

import org.junit.Assert;
import org.junit.Test;

import seleniumdemo.Calculator;

public class TestCalculator {

	@Test
	public void addTest() {
		
		Calculator cal = new Calculator();
		int a = 20;
		int b = 10;
		int expected = 30;
		int actual = cal.add(a,b);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void subTest() {
		
		Calculator cal = new Calculator();
		int a = 20;
		int b = 10;
		int expected = 10;
		int actual = cal.sub(a,b);
		
		Assert.assertEquals(expected, actual);
	}
}
