package com.intuit.lab01;

public class Lab01Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 20);
		int sum2 = calc.compute((a, b) -> {
			System.out.println("Let's calculate sum of " + a + " " + b);
			return a + b;
		});
		int sum = calc.compute((a, b) -> a + b);
		int diff = calc.compute((a, b) -> a - b);
		int product = calc.compute((a, b) -> a * b);
		int formula = calc.compute((a, b) -> a*a + b*b + 2*a*b);
		
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(diff);
		System.out.println(product);
		System.out.println(formula);
	}

}
