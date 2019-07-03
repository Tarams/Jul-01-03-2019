import java.util.stream.IntStream;

public class ParallelStreamExample1 {

	public static void main(String[] args) {
		compute();
		System.out.println("End of main");
	}
	
	private static boolean findEven(int number) {
		System.out.println("filter: " + number);
		sleep(1);
		return number % 2 == 0;
	}
	
	private static void compute() {
		IntStream numbers = IntStream.range(1, 101);
		numbers
			.filter(ParallelStreamExample1::findEven)
			.forEach(e -> {});
	}

	private static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
