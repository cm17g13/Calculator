package com.qa.calculator;

import org.junit.Test;
import org.junit.Assert;

public class AdderTest {

	private Adder adder;
	//private Subber suber;
	@Test
	public void testAdd() {
		adder = new Adder();
		int expectedValue = 4;
		int actualValue = adder.add(2, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}
	
	/*@Test
	public void testSub() {
		adder = new Adder();
		int expectedValue = 4;
		int actualValue = adder.add(2, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}*/
	
	

}
