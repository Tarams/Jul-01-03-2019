import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

//Number of threads = Number of cores + 1
//CPU intensive operations like complex recursive algorithms
//IO intensive operations
//Blocking Factor = 0 < 1
//CPU intensive, Blocking Factor will be close to 0
//Not CPU intensive Blocking Factor will be close to 1

//Number of Threads = Number of Cores/(1 - Blocking Factor)

//Blocking Factor for even number is 0.9
//Number of Threads = 4/1 - 0.9 = 40

//Blocking Factor for recursive operation is 0.01
//Number of Threads = 4/1-0.01 = 4/0.99 = approximately close to 4 

public class ParallelStreamExample2 {
	
	private static ForkJoinPool pool;
	public static void main(String[] args) {
		pool = new ForkJoinPool(40);
		
		pool.submit(() -> compute());
		//pool.submit(() -> compute());
		//compute();
		
		sleep(200);
	}


	private static boolean findEven(int number) {
		System.out.println("filter: " + number + " (" + Thread.currentThread() + ")");
		sleep(1);
		return number % 2 == 0;
	}


	private static void compute() {
		IntStream numbers = IntStream.range(1, 101);
		numbers
		.filter(ParallelStreamExample2::findEven)
		.parallel()
		.forEach(e -> {System.out.println("no of active threads: " + pool.getActiveThreadCount());});
	}

	private static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
