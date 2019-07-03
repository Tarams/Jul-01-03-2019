package com.intuit.lab01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Lab01Main {

	public static void main(String[] args) {
		List<Integer> numbers = 
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		IntStream stream1 = IntStream.range(1, 11);
		System.out.println("Max: " + stream1.max().getAsInt());
		int max = numbers
				.stream()
				.reduce((first, next) -> first > next ? first : next)
				.get();
			System.out.println("Max: " + max);
		
		IntStream stream2 = IntStream.range(1, 11);
		System.out.println("Min: " + stream2.min().getAsInt());
		int min = numbers
			.stream()
			.reduce((first, next) -> first < next ? first : next)
			.get();
		System.out.println("Min: " + min);
		
		int firstEvenNumberGreaterThan3 = numbers
			.stream()
			.filter(e -> e > 3)
			.filter(e -> e % 2 == 0)
			.map(e -> e * 2)
			.findFirst()
			.orElse(-1);
		System.out.println(firstEvenNumberGreaterThan3);
	}

}
