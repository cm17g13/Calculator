package com.qa.app;

import com.qa.calculator.operations.MathsOperation;

public class Calculator {
	private MathsOperation mathsOperation;

	public Calculator(MathsOperation mathsOperation) {
		this.mathsOperation = mathsOperation;
	}

	public int calculate(int num1, int num2) {
		return mathsOperation.calculate(num1, num2);
	}
	
	public void changeOperation(MathsOperation mathsOperation) {
		this.mathsOperation = mathsOperation;
	}

}