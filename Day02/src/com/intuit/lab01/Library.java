package com.intuit.lab01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
	private List<Integer> numbers = Arrays.asList(12, 34, 56, 21, 78, 92, 43);

	//TOO MUCH DUPLICATION

	public List<Integer> findEvenNumbers() {
		List<Integer> even = new ArrayList<>();
		for (int num : numbers) {
			if(num % 2 == 0) {
				even.add(num);
			}
		}
		return even;
	}

	public List<Integer> findOddNumbers() {
		List<Integer> odd = new ArrayList<>();
		for (int num : numbers) {
			if(num % 2 != 0) {
				odd.add(num);
			}
		}
		return odd;
	}

	public List<Integer> findSquares() {
		List<Integer> square = new ArrayList();
		for (int num : numbers) {
			square.add(num * num);
		}
		return square;
	}

	public List<Integer> findCubes() {
		List<Integer> cubes = new ArrayList<>();
		for (int num : numbers) {
			cubes.add(num * num * num);
		}
		return cubes;
	}
}
