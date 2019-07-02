package com.intuit.lab01;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ModifiedLibrary {
	private List<Integer> numbers;
	
	public ModifiedLibrary(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	public List<Integer> compute(Function<Integer, Integer> logic) {
		return numbers
			.stream()
			.map(logic)
			.collect(Collectors.toList());
	}
	
	public List<Integer> find(Predicate<Integer> predicate) {
		return numbers
			.stream()
			.filter(predicate)
			.collect(Collectors.toList());
	}
}
