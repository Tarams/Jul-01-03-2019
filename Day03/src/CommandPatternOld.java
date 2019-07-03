
public class CommandPatternOld {

	public static void main(String[] args) {
		TV sony = new TV("sony");
		Remote remote = new Remote();
		remote.tvSwitchOnCommand = new TVSwitchOnCommand(sony);
		remote.tvSwitchOffCommand = new TVSwitchOffCommand(sony);
		
		remote.switchOn();
		remote.switchOff();
		
		System.out.println();
		
		TV micromax = new TV("Micromax");
		remote.tvSwitchOnCommand = new TVSwitchOnCommand(micromax);
		remote.tvSwitchOffCommand = new TVSwitchOffCommand(micromax);
		remote.switchOn();
		remote.switchOff();
	}

}
interface Command {
	void doSomething();
}

class TVSwitchOnCommand implements Command {
	private TV tv;
	public TVSwitchOnCommand(TV tv) {
		this.tv = tv;
	}
	public void doSomething() {
		tv.switchOn();
	}
}

class TVSwitchOffCommand implements Command {
	private TV tv;
	public TVSwitchOffCommand(TV tv) {
		this.tv = tv;
	}
	public void doSomething() {
		tv.switchOff();
	}
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
	public TVSwitchOnCommand tvSwitchOnCommand;
	public TVSwitchOffCommand tvSwitchOffCommand;
	
	public void switchOn() {
		tvSwitchOnCommand.doSomething();
	}
	
	public void switchOff() {
		tvSwitchOffCommand.doSomething();
	}
}
