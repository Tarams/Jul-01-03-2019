package com.intuit.day01.lab04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<String> languages = 
				Arrays.asList("Java", "Ruby", "JavaScript", "Scala", "Clojure");
		
		//Sequential processing
		//Like an iterator
		//You cannot reuse a stream
		Stream<String> langStream = languages.stream();
		IntStream numbers = IntStream.of(1, 2, 3, 4, 5);
		IntStream numbers2 = IntStream.range(1, 100);
		
		//Print the languages
		//that begin with J
		//and length > 5
		/*langStream
			.filter(e -> {
				System.out.println("filter1: " + e);
				return e.startsWith("J");
			})
			.filter(e -> {
				System.out.println("filter2: " + e);
				return e.length() > 5;
			})
			.forEach(System.out::println);*/
		
		//Stream opens a loop
		//Takes every single element and passes it through all the conditions
		//If the final terminal condition is satisfied, it exits the loop
		//map, filter, reduce do not open a loop. 
		//They all execute on one single item only
		
		//Completely different in JavaScript
		//Every method like filter, map, reduce opens up a loop
		
		String firstLang = langStream
			.filter(e -> {
				System.out.println("filter1: " + e);
				return e.startsWith("J");
			})
			.filter(e -> {
				System.out.println("filter2: " + e);
				return e.length() > 5;
			})
			.map(e -> {
				System.out.println("map: " + e);
				return e.toUpperCase();	
			})
			.findFirst()
			.get();
		System.out.println(firstLang);
		
		
		
		
		
		
		
		
		
		
	}

}
