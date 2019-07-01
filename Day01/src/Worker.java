public interface Worker {
	//final variables
	//abstract methods

	void perform();
	
	default void fillTimesheet() {
		System.out.println("Filling timesheet");
	}
	
	default void signout() {
		System.out.println("Signing out of the system");
	}
	
	static void wth() {
		System.out.println("Wth is goign on with interfaces");
	}
}
