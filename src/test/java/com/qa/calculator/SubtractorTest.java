package com.qa.calculator;

import org.junit.Test;
import org.junit.Assert;

public class SubtractorTest {

	private Subtractor subtractor;
	@Test
	public void testSub() {
		subtractor = new Subtractor();
		int expectedValue = 0;
		int actualValue = subtractor.subtract(2, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
