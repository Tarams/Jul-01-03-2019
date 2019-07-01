package com.intuit.lab02;

import java.util.function.Predicate;

public class ValidationRules {

	public static Predicate<String> isNotNull = value -> value != null;
	public static Predicate<String> isNotBlank = value -> !value.isEmpty();
	public static Predicate<String> isLengthLesserThan6 = value -> value.length() > 6;
}
