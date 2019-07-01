package com.intuit.lab02;

import java.util.function.Predicate;

//Given a user name, validate if it's blank and not null and empty and length > 6
public class SimpleWay {

	public static void main(String[] args) {
		Predicate<String> isNotNull = userName -> userName != null;
		Predicate<String> isNotBlank = userName -> !userName.isEmpty();
		Predicate<String> isLengthLesserThan6 = userName -> userName.length() > 6;
		
		boolean valid = isNotNull
			.and(isNotBlank)
			.and(isLengthLesserThan6)
			.test(null);
		System.out.println(valid);
	}

}
