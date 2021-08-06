package com.mark.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator ti = new Calculator();
		
		ti.setOperandOne(5);
		ti.setOperandTwo(25);
		ti.setOperation("-");
		ti.performOperation();
		System.out.println(ti.getResults());

	}

}
