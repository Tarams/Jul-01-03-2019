package com.intuit.lab01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ModifiedLibrary {
	private List<Integer> numbers = Arrays.asList(12, 34, 56, 21, 78, 92, 43);
	
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
