package com.intuit.day01.lab04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {

	private static Map<Integer, String> romanNumerals = new HashMap<>();
	public static void main(String[] args) {
		romanNumerals.put(1, "I");
		romanNumerals.put(2, "II");
		romanNumerals.put(3, "III");
		romanNumerals.put(4, "IV");
		
//		String romanValue = getRomanNumeral(10);
//		if(romanValue != null) {
//			System.out.println(romanValue);
//		}
//		else {
//			System.out.println("Not available");
//		}
		
		//String?
		Optional<List<String>> opt = Optional.empty();
		System.out.println(opt.get());
		
		
		Optional<String> romanValue = getRomanNumeral(1);
		if(romanValue.isPresent()) {
			System.out.println(romanValue.get());
		}
		else {
			System.out.println("Not available");
		}
		
	}
	private static Optional<String> getRomanNumeral(int num) {
		Optional<String> romanValue = Optional.ofNullable(romanNumerals.get(num));
		return romanValue;
	}
	
	
	private static String getRomanNumeralOld(int num) {
		return romanNumerals.get(num);
//		if(romanNumerals.containsKey(num))
//			return romanNumerals.get(num);
//		else {
//			return "Not present in DB";
//		}
	}

}
