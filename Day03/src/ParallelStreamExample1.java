import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamExample1 {

	public static void main(String[] args) {
		int numberOfCores = Runtime.getRuntime().availableProcessors();
		System.out.println(numberOfCores);
		//computeFirstEven();
		System.out.println("End of main");
		Stream<Integer> stream = createStream();
		stream
			.filter(e -> e % 2 == 0)
			.sequential()
			.forEach(System.out::println);
	}
	
	private static Stream<Integer> createStream() {
		return Arrays.asList(1, 2, 3, 4, 5).stream().parallel();
	}
	
	private static boolean findEven(int number) {
		System.out.println("filter: " + number + " (" + Thread.currentThread() + ")");
		sleep(1);
		return number % 2 == 0;
	}
	
	private static void computeFirstEven() {
		IntStream numbers = IntStream.range(1, 101);
		int even = numbers
			.filter(ParallelStreamExample1::findEven)
			//.parallel()
			.filter(e -> true)
			//.sequential()
			.filter(e -> true)
			.parallel()
			.findFirst()
			.getAsInt();
		System.out.println("First Even: " + even);
	}
	
	private static void compute() {
		IntStream numbers = IntStream.range(1, 101);
		numbers
			.filter(ParallelStreamExample1::findEven)
			.parallel()
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
