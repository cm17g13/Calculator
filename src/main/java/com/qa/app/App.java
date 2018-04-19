package com.qa.app;

import com.qa.calculator.operations.Add;
import com.qa.calculator.operations.Divide;
import com.qa.calculator.operations.Multiply;
import com.qa.calculator.operations.Subtract;

public class App {

	public static void main(String[] args) {
		Add add = new Add();
		Subtract subtract = new Subtract();
		Divide divide = new Divide();
		Multiply multiply = new Multiply();

		
		
		Calculator calculator = new Calculator(add);
		int addValue = calculator.calculate(2, 2);
		System.out.println("This is addValue " + addValue);

		calculator.changeOperation(subtract);
		int subtractValue = calculator.calculate(4, 2);
		System.out.println("This is subtractValue " + subtractValue);

		calculator.changeOperation(multiply);
		int multiplyValue = calculator.calculate(5, 5);
		System.out.println("This is multiplyValue " + multiplyValue);

		calculator.changeOperation(divide);
		int divideValue = calculator.calculate(2, 2);
		System.out.println("This is divideValue " + divideValue);
	}

}