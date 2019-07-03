package com.intuit.lab02;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;


//Design
//Less ceremony
//Switch to&from parallel and sequential
//Be judicious about using parallel streams
public class Lab02Main {

	public static void main(String[] args) throws InterruptedException {
		//computeSumSequentially();
		//computeSumParallely();
		ForkJoinPool fjp = new ForkJoinPool(1000);
		fjp.submit(() -> computeSumParallely());
		
		Thread.sleep(100000);
		
	}
	
	private static void computeSumParallely() {
		long start = System.currentTimeMillis();
		LongStream numbers = LongStream.range(1, 100000);
		long sum = numbers
			.map(e -> e * e)
			.parallel()
			.sum();
		System.out.println("Sum: " + sum);
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end-start) + "ms");
	}
	
	private static void computeSumSequentially() {
		long start = System.currentTimeMillis();
		LongStream numbers = LongStream.range(1, 100000);
		long sum = numbers
			.map(e -> e * e)
			.sum();
		System.out.println("Sum: " + sum);
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end-start) + "ms");
	}

}
