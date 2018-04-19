package com.qa.calculator;

import org.junit.Test;
import org.junit.Assert;

public class MultiplyTest {

	private Multiply multiply;
	@Test
	public void testMultiply() {
		multiply = new Multiply();
		int expectedValue = 4;
		int actualValue = multiply.multiply(2, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
