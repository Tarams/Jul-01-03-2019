package com.intuit.lab01;

import java.util.Arrays;
import java.util.List;

public class Lab01Main {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 34, 56, 21, 78, 92, 43);
		ModifiedLibrary library = new ModifiedLibrary(numbers);
		
		List<Integer> evenNumbers = library.find(n -> n % 2 == 0);
		List<Integer> oddNumbers = library.find(n -> n % 2 != 0);
		
		List<Integer> squares = library.compute(n -> n * n);
		List<Integer> cubes = library.compute(n -> n * n * n);
		
		/*Library library = new Library();
		
		List<Integer> evenNumbers = library.findEvenNumbers();
		List<Integer> oddNumbers = library.findOddNumbers();
		
		List<Integer> squares = library.findSquares();
		List<Integer> cubes = library.findCubes();*/
		
		System.out.println(evenNumbers);
		System.out.println();
		System.out.println(oddNumbers);
		System.out.println();
		System.out.println(squares);
		System.out.println();
		System.out.println(cubes);
	}

}
