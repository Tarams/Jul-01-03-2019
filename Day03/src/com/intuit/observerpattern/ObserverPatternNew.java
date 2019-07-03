package com.intuit.observerpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ObserverPatternNew {

	public static void main(String[] args) {
		CricketMatchFeeder espn = new CricketMatchFeeder();
		
		SoftwareDeveloper sam = new SoftwareDeveloper();
		Website toi = new Website();
		espn.addObserver(sam::killTime);
		espn.addObserver(sam::killOthersTimeAlso);
		espn.addObserver(toi::displayNews);
		espn.addObserver(matchInfo -> System.out.println("Whatsapp forward: " + matchInfo));
		
		espn.supplyMatchStatus("India won");
		
		espn.supplyMatchStatus("India wins badly");
		
		
	}

}

class CricketMatchFeeder {
	private List<Consumer<String>> observers = new ArrayList<>();
	public void addObserver(Consumer<String> consumer) {
		observers.add(consumer);
	}
	
	public void supplyMatchStatus(String info) {
		observers.forEach(ob -> ob.accept(info));
	}
	
}

class SoftwareDeveloper {
	public void killTime(String matchInfo) {
		System.out.println("Dude, this is the latest info " + matchInfo);
	}
	
	public void killOthersTimeAlso(String matchInfo) {
		System.out.println("Call up friends, this is the latest info " + matchInfo);
	}
}

class Website {
	public void displayNews(String matchInfo) {
		System.out.println("BREAKING NEWS: " + matchInfo);
	}
}
