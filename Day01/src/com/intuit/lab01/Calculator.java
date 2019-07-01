package com.intuit.lab01;

public class Calculator {
	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;		
	}
	
	public int compute(CalcOperation calcOperation) {
		return calcOperation.perform(num1, num2);
	}
	
}

interface CalcOperation {
	int perform(int a, int b);
}
