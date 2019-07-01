package com.intuit.lab02;

import java.util.function.Predicate;

public class HttpValidationRules {

	public static Predicate<Integer> success = code -> code == 200;
	public static Predicate<Integer> error = code -> code == 500;
	public static Predicate<Integer> notFound = code -> code == 404;

}
