package com.intuit.commandpattern;

public class CommandPatternNew {

	public static void main(String[] args) {
		TV sony = new TV("sony");
		Remote remote = new Remote();
		remote.tvSwitchOnCommand = sony::switchOn;
		remote.tvSwitchOffCommand = sony::switchOff;
		
//		remote.tvSwitchOnCommand = new TVSwitchOnCommand(sony);
//		remote.tvSwitchOffCommand = new TVSwitchOffCommand(sony);
		
		remote.switchOn();
		remote.switchOff();
		
		System.out.println();
		
		TV micromax = new TV("Micromax");
		remote.tvSwitchOnCommand = micromax::switchOn;
		remote.tvSwitchOffCommand = micromax::switchOff;
//		remote.tvSwitchOnCommand = new TVSwitchOnCommand(micromax);
//		remote.tvSwitchOffCommand = new TVSwitchOffCommand(micromax);
		remote.switchOn();
		remote.switchOff();
	}

}
interface Command {
	void doSomething();
}



class TV {
	private String model;
	public TV(String model) {
		this.model = model;
	}
	public void switchOn() {
		System.out.println(model + " is on");
	}
	
	public void switchOff() {
		System.out.println(model + " is off");
	}
}

class Remote {
	public Command tvSwitchOnCommand;
	public Command tvSwitchOffCommand;
	
	public void switchOn() {
		tvSwitchOnCommand.doSomething();
	}
	
	public void switchOff() {
		tvSwitchOffCommand.doSomething();
	}
}
