
public class LambdaExample3 {

	public static void main(String[] args) {
		Work eat = () -> System.out.println("Eating all the time");
		playAround(eat);
		
		playAround(() -> System.out.println("WTH is going on"));
		
		playAround(new Work() {
			public void doSomething() {
				System.out.println("Scratching my head");
			}
		});
	}
	
	private static void playAround(Work work) {
		work.doSomething();
	}

}

interface Work {
	void doSomething();
}
