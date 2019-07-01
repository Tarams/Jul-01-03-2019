package com.intuit.lab01;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		//Takes any data type as Input and returns Boolean Output
		//filter() method in Stream API is a function that accepts a Predicate as argument
		
		Predicate<Integer> evenCheck = num -> num % 2 == 0;
		boolean b = evenCheck.test(12);
		System.out.println(b);
		evenCheck
			.negate()
			.test(11);
		
		Predicate<String> cityCheck = city -> city.startsWith("C");
		cityCheck.test("Cochin");
		cityCheck.test("Chennai");
		
		
		NumberCheck check = num -> num % 2 == 0;
		check.isEven(12);
		
	}

}

@FunctionalInterface
interface NumberCheck {
	boolean isEven(int num);
}