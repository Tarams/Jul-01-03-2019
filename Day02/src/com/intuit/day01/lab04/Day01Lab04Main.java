package com.intuit.day01.lab04;

import java.util.Arrays;
import java.util.List;

public class Day01Lab04Main {
	private static List<Item> items = Arrays.asList(
			new Item("Nike", 20.45), 
			new Item("Adidas", 31.45), 
			new Item("Reebok", 29.25), 
			new Item("Puma", 25.15), 
			new Item("Fila", 15.15));

	private static boolean findPriceGreaterThan(Item item) {
		return item.getPrice() > 20;
	}
	
	private static double getDiscountedPrice(Item item) {
		return item.getPrice() - (item.getPrice() * 0.1);
	}
	
	private static double addPrice(double first, double next) { 
		return first + next;
	}
	
	private static double addPrice2(Item first, Item next) { 
		return first.getPrice() + next.getPrice();
	}
	
	
	public static void main(String[] args) {
		//Find the items that cost more than 20; 
		//add a discount of 10% 
		//and print the total price;
		
		final double totalPrice = items
			.stream()
			.filter(Day01Lab04Main::findPriceGreaterThan)
			.map(Day01Lab04Main::getDiscountedPrice)
			.reduce((first, next) -> first + next)
			//.reduce(Day01Lab04Main::addPrice)
			.get();
		System.out.println(totalPrice);
		
		
	}

}
