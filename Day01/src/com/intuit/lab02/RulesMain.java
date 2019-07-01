package com.intuit.lab02;
import static com.intuit.lab02.ValidationRules.*;

import java.util.function.Predicate;

public class RulesMain {

	public static void main(String[] args) {
		//Lazy Evaluation
		Predicate<String> userNameRules = isNotNull
					.and(isNotBlank)
					.and(isLengthLesserThan6);
		
		boolean valid = userNameRules.test(null);
		System.out.println(valid);
	}

}
