import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

//Used to build(add) data to a stream
public class StreamBuilderExample {
	
	public static void main(String[] args) {
		Builder<Double> numbersBuilder = 
				Stream.builder();

		int count = 0;
		
		while(count < 50) {
			double randomNumber = Math.random() * 100;
			numbersBuilder.add(randomNumber);
			count++;
		}
		Stream<Double> numbersStream = numbersBuilder.build();

		numbersStream
			.filter(e -> e > 90)
			.forEach(System.out::println);
	}

}
