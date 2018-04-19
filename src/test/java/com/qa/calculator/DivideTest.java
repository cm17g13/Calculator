package com.qa.calculator;

import org.junit.Test;
import org.junit.Assert;

public class DivideTest {

	private Divide Divide;
	@Test
	public void testDivide() {
		Divide = new Divide();
		int expectedValue = 4;
		int actualValue = Divide.divide(2, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
