package com.intuit.lab03;

import java.util.function.Function;

public class Lab03Main {

	public static void main(String[] args) {
		Function<Input, Input> aSquare = 
				ip -> new Input(ip.a, ip.b, ip.result + (ip.a * ip.a));
		Function<Input, Input> bSquare = 
				ip -> new Input(ip.a, ip.b, ip.result + (ip.b * ip.b));		
		Function<Input, Input> twoAB = 
				ip -> new Input(ip.a, ip.b, ip.result + (2 * ip.a * ip.b));
				
				
		final int result = aSquare
			.andThen(bSquare)
			.andThen(twoAB)
			.apply(new Input(10, 12, 0))
			.result;
		System.out.println(result);
	}

}

class Input {
	public final int a, b, result;
	public Input(int a, int b, int result) {
		this.a = a;
		this.b = b;
		this.result = result;
	}
}
